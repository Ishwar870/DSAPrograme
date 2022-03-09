package Array;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for (int i=0;i<nums.length;i++){
            for (int j = 1;j< nums.length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No Solution found");
    }
    public static void main(String[] args) {
        int nums[] = {3,5,6,7,9};
        int target = 11;
        TwoSum sda = new TwoSum();
        int[] result = sda.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
