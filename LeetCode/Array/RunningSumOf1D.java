package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RunningSumOf1D {
    public static int[] runningSum(int[] nums){
        for (int i=1;i< nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
