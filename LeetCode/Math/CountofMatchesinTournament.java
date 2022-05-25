package Math;

import java.util.Scanner;

public class CountofMatchesinTournament {
    public static int numberOfMatches(int n) {
//        int matches = 0;
//        while (n > 1){
//            if (n % 2 == 0){
//                n = n/2;
//                matches += n;
//            }else {
//                n = n/2;
//                matches += matches+n;
//                n=n + 1;
//            }
//        }
//        return matches;
        return n-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberOfMatches(n));
    }
}
