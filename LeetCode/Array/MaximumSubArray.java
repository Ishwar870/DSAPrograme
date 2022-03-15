package Arrays;

import java.util.Scanner;

public class MaximumSubArray {
    public static int maxSubArray(int[] arr){
        if (arr.length == 0)
            return 0;
        int currMax = arr[0];
        int maxSum = arr[0];
        for (int i =0;i<arr.length;i++){
            currMax = Math.max(arr[i] , currMax + arr[i]);
            maxSum = Math.max(currMax,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
}
