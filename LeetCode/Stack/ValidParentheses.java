package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        if (str == null){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i =0;i<str.length();i++){
            if ('{' == str.charAt(i) || '(' == str.charAt(i) || '[' == str.charAt(i))
                stack.push(str.charAt(i));
            else if (!stack.isEmpty() && '}' == str.charAt(i) && '{' == stack.peek() )
                stack.pop();
            else if (!stack.isEmpty() && ')' == str.charAt(i) && '(' == stack.peek())
                stack.pop();
            else if (!stack.isEmpty() && ']' == str.charAt(i) && '[' == stack.peek())
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}
