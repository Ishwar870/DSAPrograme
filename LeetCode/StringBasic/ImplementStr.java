package StringBasic;

import java.util.Scanner;

public class ImplementStr {
    public static int Strstr(String haystack , String needle){
        if(haystack.isEmpty()) return 0;
        for (int i = 0; i<haystack.length()-needle.length()+1;i++){
            String str = haystack.substring(i,i+needle.length());
            if (str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        System.out.println(Strstr(haystack,needle));
    }
}
