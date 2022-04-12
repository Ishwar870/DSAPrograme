package interview;

import java.util.Stack;

public class reverseString {
    public static String Reverse(String str){
        char[] revStr = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        for (int i =0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        int i =0;
        while (!stack.isEmpty()){
            revStr[i++] = stack.pop();
        }
        return new String(revStr);
    }
    public static void main(String[] args) {
        String str = "Ishwar Chand";
        System.out.println(Reverse(str));
    }
}
