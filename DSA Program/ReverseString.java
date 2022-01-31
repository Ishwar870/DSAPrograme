package String;

import java.util.Scanner;

//import static java.lang.StringUTF16.charAt;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(Reverse(str));
    }

    private static String Reverse(String str) {
        if(str.isEmpty()){
            return str;
        }
        return Reverse(str.substring(1)) + str.charAt(0);
    }

}
