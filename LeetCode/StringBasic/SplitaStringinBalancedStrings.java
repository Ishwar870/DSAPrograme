package StringBasic;

public class SplitaStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        int l =0,r=0,count = 0;
        if (s.length() == 0){
            return 0;
        }
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == 'L'){
                l++;
            }else {
                r++;
            }
            if (l == r){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        balancedStringSplit(s);
        System.out.println(balancedStringSplit(s));
    }
}
