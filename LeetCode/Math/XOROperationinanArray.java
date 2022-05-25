package Math;

import java.util.Arrays;
import java.util.Scanner;

public class XOROperationinanArray {
    public static int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int xor = 0;
        for (int i = 0;i<n;i++){
            nums[i] = start + 2 *i;
            xor = xor ^ nums[i];
        }
//        int xor = 0 ;
//        for (int i =0;i<n;i++){
//            xor = xor ^ nums[i];
//        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        System.out.println(xorOperation(n,start));
//        System.out.println(Arrays.toString(xorOperation(n,start)));
    }
}
