package DynamicProgramme;

import java.util.Scanner;

public class ZeroOneKnsapack {
    public static int KnapSack(int c , int n, int wt[] , int val[]){
        int i , w;
        int dp[][] = new int[n+1][c+1];
        for (i =0;i<=n;i++){
            for (w=0;w<=c;w++){
                if (i ==0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i-1] <= w)
                    dp[i][w] = max(val[i-1]+dp[i-1][w-wt[i-1]],dp[i-1][w]);
                else
                    dp[i][w] = dp[i-1][w];
            }
        }
        return dp[n][c];
    }
    public static int max(int a, int b){
        return (a>b)?a:b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int wt[] = new int[n];
        int val[] = new int[n];
        for (int i =0;i<n;i++){
            wt[i] = sc.nextInt();
        }
        for (int i =0;i<n;i++){
            val[i] = sc.nextInt();
        }
        KnapSack(c,n,wt,val);
        System.out.println(KnapSack(c,n,wt,val));
    }
}
