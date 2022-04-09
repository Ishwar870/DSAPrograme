package Arrays;

import java.util.Scanner;

public class SumofAllOddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr){
        int n = arr.length;
       int sum = 0;
       for (int i =0;i<n ;i++){
          int sum1 = i+1;
          int sum2 = n-i;
          int sum3 = (sum1 * sum2);
          int sum4 = (sum3+1)/2;
          int sum5 = sum4 * arr[i];
          sum = sum + sum5;
       }
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sumOddLengthSubarrays(arr);
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
