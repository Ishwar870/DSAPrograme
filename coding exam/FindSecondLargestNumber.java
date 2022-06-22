package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestNumber {
    public static int secondLargest(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int largest = 0, secondLargest = 0;

        for (int i =0;i<n;i++){
           largest = Math.max(largest, arr[i]);
        }
        for (int i =0;i<n;i++){
            if (arr[i] != largest){
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondLargest(arr));
    }
}
