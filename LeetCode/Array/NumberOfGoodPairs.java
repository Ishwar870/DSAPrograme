package Arrays;

import java.util.Scanner;

public class NumberOfGoodPairs {
//    Input: nums = [1,2,3,1,1,3]
//    Output: 4
//    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    public static int goodPair(int[] nums){
        int count = 0;
        for (int i=0;i< nums.length;i++){
            for (int j= i+1;j< nums.length;j++){
                if (nums[i] == nums[j]){
                    count = count+1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(goodPair(arr));
    }
}
