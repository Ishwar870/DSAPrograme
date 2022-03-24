package Recursion;

import java.util.Scanner;

public class StringLength {
    public static int strLength(String str){
         int length = 0;
        if (str.equals("")){
            return length;
        }else{
            return strLength(str.substring(1)) + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(strLength(str));
    }
}
