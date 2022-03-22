package DynamicProgram;

import java.util.Scanner;

public class climbStairs {
    public static int Climb(int n){
        int a = 1;
        int b = 1;
        int temp = 0;
        if (n <= 1 ){
            return 1;
        }else{
            for (int i =2; i<=n ;i++){
                temp = a +b;
                a = b;
                b = temp;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Climb(n));
    }
}
