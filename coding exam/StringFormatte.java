package StringBasic;

import java.util.Scanner;

public class StringFormatte {
    public static String format(String s){
        String pat = null;
        int patCu;
        for (int i=0;i<s.length()-1;i++){
            for (int j=i+1;j<s.length()-1;j++){
                String subStr = s.substring(i,j+1);
                patCu = 1;
                for (int k =0;k<s.length()-subStr.length()+1;k++){
                    if (k == i) continue;
                    if (subStr.equals(s.substring(k,k+subStr.length()))){
                        pat = subStr;
                    }
                }
            }

        }
        return pat!=null ? " yes" + pat:" no null";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        format(str);
        System.out.println(format(str));

    }
}
