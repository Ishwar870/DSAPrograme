package Math;

import java.util.Scanner;

public class NumberofStepstoReduceaNumbertoZero {
    public static int numberOfSteps(int num) {
        int count = 0;
//        while (num != 0) {
//            if (num % 2 == 0) {
//                num = num / 2;
//            } else {
//                num = num - 1;
//            }
//            count++;
//        }
        do {
            if (num % 2 == 0){
                num = num/2;
            }else {
                num = num-1;
            }
            count++;
        }
        while (num != 0);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(numberOfSteps(num));
    }
}
