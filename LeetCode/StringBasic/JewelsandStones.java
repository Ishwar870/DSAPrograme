package StringBasic;

import java.util.HashSet;

public class JewelsandStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet map = new HashSet<>();
        int count =0;
        for (Character k: jewels.toCharArray()){
            map.add(k);
        }
        for (Character s: stones.toCharArray()){
            if (map.contains(s)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
