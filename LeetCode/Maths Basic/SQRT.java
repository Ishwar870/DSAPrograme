package Basic;

import java.util.Scanner;

public class SQRT {
//    method 2
    public static int mySqrt(int x){
        return (int) Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        method 1
//        int y = (int) Math.sqrt(x);
//        System.out.println(y);
        System.out.println(mySqrt(x));
    }
}
