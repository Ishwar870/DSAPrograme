package Math;

import java.util.Scanner;
//Input: n = 234
//        Output: 15
//        Explanation:
//        Product of digits = 2 * 3 * 4 = 24
//        Sum of digits = 2 + 3 + 4 = 9
//        Result = 24 - 9 = 15

public class SubtracttheProductandSumofDigitsofanInteger {
    public static int subtractProductAndSum(int n) {
        String temp = Integer.toString(n);
        int arr[] = new int[temp.length()];
        for (int i =0;i<arr.length;i++){
            arr[i] = temp.charAt(i)-'0';
        }
        int add = 0, product = 1;
        for (int i=0;i< arr.length;i++){
            add += arr[i];
            product *= arr[i];
        }

        int diff = product - add;
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        subtractProductAndSum(n);
        System.out.println(subtractProductAndSum(n));
    }
}
