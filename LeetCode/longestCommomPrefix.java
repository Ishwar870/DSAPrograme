package StringBasic;

import java.util.Scanner;

public  class longestCommomPrefix {
    public String commonPrefix(String[] str){
        if (str.length == 0){
            return "";
        }
        String prefix = str[0];
        for (int i =0;i<str.length;i++){
            while (str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        longestCommomPrefix a = new longestCommomPrefix();
        String str[] = {"flight" , "flip", "flop"};
        a.commonPrefix(str);
        System.out.println(a.commonPrefix(str));

    }
}
