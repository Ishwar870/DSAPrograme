package Arrays;

import java.util.Scanner;

public class CountNumberofPairsWithAbsoluteDifferenceK {
    public static int countKDifference(int[] nums, int k){
        int n = nums.length;
        int sum = 0;
        for (int i=0;i<n;i++){
            int count = 0;
            for (int j =0;j<n;j++){
                if (nums[i] - nums[j] == k){
                    count = count+1;
                }
            }
            sum += count;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        countKDifference(arr,k);
        System.out.println(countKDifference(arr,k));
    }
}
