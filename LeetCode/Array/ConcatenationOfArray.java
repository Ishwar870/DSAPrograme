package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static int[] concatenation(int[] nums){
        int n = nums.length;
        int ans[] = new int[2*n];
        for (int i =0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(concatenation(arr)));
    }
}
