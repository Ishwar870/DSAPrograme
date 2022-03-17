package StringBasic;

import java.util.Scanner;

public class AddBin {
    public static String addBin(String a , String b){
        StringBuilder res = new  StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum%2);
        }
        if (carry != 0) res.append(carry);

        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder res = new StringBuilder();
        String a = "11";
        String b = "1";
//        addBin(a,b);
        System.out.println(addBin(a,b));
    }
}
