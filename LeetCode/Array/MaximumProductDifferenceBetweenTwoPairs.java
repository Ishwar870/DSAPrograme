package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static int maxProductDifference(int[] nums) {
        int biggest = 0;
        int secBig = 0;
        int small = 0;
        int secSmall = 0;
        Arrays.sort(nums);
        biggest = nums[nums.length-1];
        secBig = nums[nums.length-2];
        small = nums[0];
        secSmall = nums[1];
        int maxProduct = (biggest * secBig) - (small * secSmall);
        return maxProduct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProductDifference(nums));
    }
}
