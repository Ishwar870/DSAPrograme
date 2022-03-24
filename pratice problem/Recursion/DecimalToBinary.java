package Recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static int decimalToBinary(int n){
        if (n == 0){
            return 0;
        }else{
            return ((n%2) + 10 * decimalToBinary(n/2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimalToBinary(n));
    }
}
