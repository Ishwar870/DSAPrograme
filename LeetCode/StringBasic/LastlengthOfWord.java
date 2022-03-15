package StringBasic;

import java.awt.*;
import java.util.Scanner;

public class LastlengthOfWord {
    public static int lengthOfWord(String s){
        int len = s.length()-1;
        int count = 0;
        while (len >= 0 && s.charAt(len) == ' ')
            len--;
        while (len >= 0 && s.charAt(len) != ' ') {
            count++;
            len--;
        }
        return count;
//        Method 2 
   /*      s.trim();
         return s.substring(s.lastIndexOf(" ")+1,s.length()).length();*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfWord(s));
    }
}
