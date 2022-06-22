package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxNum {
    public static int findMax(int[] arr, int n){
        Arrays.sort(arr);
        int num = arr[0];
        for (int i =n-1;i>=0;i--){
            num = num * 10  + arr[i];
        }
        return num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr , n));
    }
}
