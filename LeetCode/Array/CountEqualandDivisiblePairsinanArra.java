package Arrays;

import java.util.Scanner;

public class CountEqualandDivisiblePairsinanArra {
    public static int countPairs(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i=0;i<n;i++){
            for (int j =i+1;j<n;j++){
                if (nums[i] == nums[j]){
                    if ((i * j) %k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        countPairs(arr,k);
        System.out.println(countPairs(arr,k));
    }
}
