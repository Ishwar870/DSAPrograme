package StringBasic;

import java.util.Stack;

public class FindFirstPalindromicStringintheArray {
    public static boolean isPalindrome(String str){
        char c[] = new char[str.length()];
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length ; i++) {
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            result = result + stack.pop();
        }
        if(str.equals(result)){
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
            return "";
    }
    
    
    
    // Method 2 
    class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            int start = 0;
            int end = word.length()-1;
            while(start <= end){
                if(word.charAt(start) != word.charAt(end))
                    break;
                start++;
                end--;
            }
            if(start >= end){
                return word;
            }
        }
        return "";
        
    }
}
    public static void main(String[] args) {
        String str[] = {"abc","car","ada","racecar","cool"};
        firstPalindrome(str);
        System.out.println(firstPalindrome(str));
    }
}
