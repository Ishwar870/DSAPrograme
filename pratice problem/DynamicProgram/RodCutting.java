package DynamicProgramme;

import java.util.Scanner;

public class RodCutting {
    public static int rod_cutting(int n , int[] price){
        int max_profit[] = new int[n+1];
        for (int i =0;i<=n;i++){
            max_profit[i] = 0;
        }
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (price[j-1]+max_profit[i-j] > max_profit[i]){
                    max_profit[i] = price[j-1]+max_profit[i-j];
                }
            }
        }
        return max_profit[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int[n];
        for (int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }
        System.out.println(rod_cutting(n,price));
    }
}
