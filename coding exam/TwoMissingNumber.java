package Array;

import java.util.Scanner;

public class TwoMissingNumber {
    public static void findTwoMissingNumber(int arr[],int n){
        boolean mark[] = new boolean[n+1];
        for (int i=0;i<n-2;i++){
            mark[arr[i]] = true;
        }
        for (int i =1;i<=n;i++){
            if (!mark[i]){
                System.out.print(i+ " ");
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,5,6};
        int n = 2 + arr.length;
        findTwoMissingNumber(arr, n);
    }
}
