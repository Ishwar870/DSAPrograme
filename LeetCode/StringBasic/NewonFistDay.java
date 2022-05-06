package StringBasic;

import java.util.Scanner;

public class NewonFistDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Apple";
        String str2 = sc.next();
        if(str1.equals(str2)){
            System.out.println("Gravity");
        }else{
            System.out.println("Space");
        }
    }
}
