// Method 1
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
// Method 2
package DynamicProgramme;

import java.util.Scanner;

public class climpStairs {
    public static int findSteps(int n){
        int steps[] = new int[n+1];
        steps[1] = 1;
        steps[2] = 2;
        for (int i=3;i<=n;i++){
            steps[i] = steps[i-1]+steps[i-2];
        }
        return steps[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSteps(n));
    }
}
