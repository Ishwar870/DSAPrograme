package interview;

import java.util.Scanner;

//Given a number, we need to find sum of its digits using recursion.
//        Examples:
//
//
//        Input : 12345
//        Output : 15
//
//        Input : 45632
//        Output :20
public class SumofDigits {
    public static int sumDigit(int n){
        int even = 0;
        if (n == 0)
            return 0;
       int digit = n%10;
        if (digit%2 == 0){
            even = digit + even;
        }
        return even + sumDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumDigit(n);
        System.out.println(sumDigit(n));
    }
}
//calling sumofdigit function(12345)
//false
//12345%10 + sumofDigit(12345/10)
//