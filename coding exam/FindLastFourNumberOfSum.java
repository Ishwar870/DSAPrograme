package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindLastFourNumberOfSum {
    public static void sort(int arr[]){
        for (int i =0;i< arr.length-1;i++){
            for (int j =i+1; j< arr.length;j++){
                if (arr[i] < arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static int LargeFourSum(int arr[], int n){
        sort(arr);
        int sum = 0;
       for(int i =0;i<4;i++){
           sum += arr[i];
       }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        LargeFourSum(arr,n);
        System.out.println(LargeFourSum(arr, n));
    }
}
