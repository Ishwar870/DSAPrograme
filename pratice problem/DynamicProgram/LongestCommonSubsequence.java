package DynamicProgramme;

import java.util.Scanner;

public class LongestCommonSubsequence {
    public static int LCS(int m , char[] x, int n, char[] y){
        int i,j;
        int dp[][] = new int[m+1][n+1];
        for (i=0;i<=m;i++){
            for (j=0;j<=n;j++){
                if (i==0 || j==0){
                    dp[i][j] = 0;
                }else if (x[i-1] == y[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static int max(int a , int b){
        return (a > b) ? a: b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 5;
        char[] x = {'B','A','C','D','B'};
        int n = 4;
        char[] y = {'B','D','C','B'};

        System.out.println(LCS(m,x,n,y));
    }
}
