package Arrays;

import java.util.Arrays;
import java.util.List;
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//        Output: 1
//        Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
public class CountItemsMatchingaRule {
    public  static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int temp =0;
        if (ruleKey.equals("type")){
            temp = 0;
        }else if (ruleKey.equals("color")){
            temp = 1;
        }else {
            temp = 2;
        }
        int count =0;
        for (int i =0;i< items.size();i++){
            if (items.get(i).get(temp).equals(ruleValue))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> item = Arrays.asList(("phone","blue","pixel"),("computer","silver","lenovo"),("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "phone";
        System.out.println(countMatches(item,ruleKey,ruleValue));
    }
}
