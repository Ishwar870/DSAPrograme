package Maths;

import java.util.Scanner;

public class plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev =0;
        int temp = n;
        while (temp != 0){
            int ld = temp % 10;
             rev = rev * 10 + ld;
             temp = temp /10;
        }
        if(rev == n){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
