package Arrays;

public class CounttheNumberofConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words){
        int count = 0;
        boolean b = false;
            for (String s: words){
                for (int i=0;i<s.length();i++){
                    String p = s.charAt(i)+"";
                    if (allowed.contains(p)){
                        b = true;
                    }else{
                        b = false;
                        break;
                    }
                }
                if (b){
                    count++;
                }
            }
        return count;
    }
    public static void main(String[] args) {
        String words[] = {"a","bd","aaab","baa","badab"};
        String allowed = "ab";
        countConsistentStrings(allowed,words);
//        System.out.println(countConsistentStrings(allowed,words));
    }
}
