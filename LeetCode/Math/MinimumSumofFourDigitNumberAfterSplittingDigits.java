package Math;
//Input: num = 2932
//        Output: 52
//        Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
//        The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
//Input: num = 4009
//        Output: 13
//        Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc.
//        The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static int minimumSum(int num) {
        ArrayList<Integer> list = new ArrayList<>();// create a list to stores thr four digit number
        for (int i =0;i<4;i++){
            list.add(num%10); // we are adding a number of four digit 2932%10
            num = num/10; // we are storing the value ti the num num/10;
        }
        Collections.sort(list);
        int num1 = 0, num2 = 0;
        for (int i =0;i<2;i++){
            num1 = num1*10+list.remove(0);
            num2 = num2*10+list.remove(0);
        }
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        minimumSum(n);
        System.out.println(minimumSum(n));
    }
}
