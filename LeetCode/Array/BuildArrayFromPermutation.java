package Arrays;

import java.util.Arrays;
import java.util.Scanner;
//Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3];
public  class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums){
        int ans[] = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
