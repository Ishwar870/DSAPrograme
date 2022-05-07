package StringBasic;

import java.util.Arrays;

public class SortingtheSentence {
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        for (int i=0;i<str.length;i++){
            for (int j =1;j<str.length;j++){
                String temp = "";
                int a = Character.getNumericValue(str[j-1].charAt(str[j-1].length()-1));
                int b = Character.getNumericValue(str[j].charAt(str[j].length()-1));
                if (a>b){
                    temp = str[j-1];
                    str[j-1] = str[j];
                    str[j] = temp;
                }
            }
        }
        return Arrays.toString(str).replaceAll("[^A-Za-z ]", "");
    }
    public static void main(String[] args) {
        String str = "Myself2 Me1 I4 and3";
        sortSentence(str);
        System.out.println(sortSentence(str));
    }
}
