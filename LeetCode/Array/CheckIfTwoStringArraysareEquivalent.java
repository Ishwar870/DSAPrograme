package Arrays;

import java.util.Arrays;

public class CheckIfTwoStringArraysareEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        for (int i =0;i< word1.length;i++){
           a = a.concat(word1[i]);
        }
        String b = "";
        for (int i =0;i< word2.length;i++){
        b  =  b.concat(word2[i]);
        }
        if (a.equals(b)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "db"};
        arrayStringsAreEqual(word1,word2);
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
