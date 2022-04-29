package StringBasic;

import java.util.Stack;

public class FindFirstPalindromicStringintheArray {
    public static boolean isPalindrome(String t){
        char c[] = new char[t.length()];
        String res = "";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < c.length ; i++) {
            st.push(t.charAt(i));
        }
        while(!st.isEmpty()){
            res = res + st.pop();
        }
        if(t.equals(res)){
            return true;
        }
        return false;
    }
    public static String firstPalindrome(String[] words) {
            for (String word: words){
                if (isPalindrome(word)){
                    return word;
                }
            }
            return " ";
    }
    public static void main(String[] args) {
        String str[] = {"abc","car","ada","racecar","cool"};
        firstPalindrome(str);
        System.out.println(firstPalindrome(str));
    }
}
