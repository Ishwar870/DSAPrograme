package Recursion;

public class IsPalindrome {
    public static int isPalindrome(String str[] , int start , int end){
        if (start >= end){
            return 1;
        }else if(str[start] == str[end]){
            return isPalindrome(str,start+1,end-1);
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        String str[] = {"madam"};
        int start = 0;
        int end = str.length-1;
        System.out.println(isPalindrome(str,start,end));
    }
}
