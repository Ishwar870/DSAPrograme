package Arrays;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//Input: operations = ["--X","X++","X++"]
//        Output: 1
//        Explanation: The operations are performed as follows:
//        Initially, X = 0.
//        --X: X is decremented by 1, X =  0 - 1 = -1.
//        X++: X is incremented by 1, X = -1 + 1 =  0.
//        X++: X is incremented by 1, X =  0 + 1 =  1.
public class FindValueOfVariableAfterPerforming {
    public static int findValue(String[] operations){
        int X = 0;
        for(int i=0;i<operations.length;i++){
            switch (operations[i]){
                case("X++"):
                    X = X +1;
                break;
                case("++X"):
                    X = X +1;
                    break;
                case("X--"):
                    X = X - 1;
                break;
                case("--X"):
                    X = X -1;
                break;

            }
        }
        return X;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] operation = new String[n];
        for (int i=0;i<n;i++){
            operation[i] = sc.next();
        }
        findValue(operation);
        System.out.println(findValue(operation));
    }
}
