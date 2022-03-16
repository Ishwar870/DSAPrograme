package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class onePlus {
    public static int[] plusOne(int arr[]){
        for (int i = arr.length-1; i >= 0 ; i--){
            if (arr[i] < 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] ans = new int[arr.length+1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {9};
        plusOne(arr);
     System.out.println(Arrays.toString(plusOne(arr)));
    }
}
