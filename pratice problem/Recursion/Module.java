package Recursion;

import java.util.Scanner;

public class Module {
    public static int mod(int num , int den){
        if (num < den){
            return num;
        }else {
            return mod(num - den , den);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int den = sc.nextInt();
        System.out.println(mod(num,den));
    }
}
