package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]
//        Explanation: If you give all extraCandies to:
//        - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//        - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//        - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//        - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//        - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
public class KidsWiththeGreatestNumberofCandies {
    public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> list = new ArrayList<>();
        int n = candies.length;
        int temp =0;
        int ct = 0;
        for (int i =0 ; i<n;i++){
            temp = candies[i] + extraCandies;
            for (int j=0;j<n;j++){
                if (temp >= candies[j])
                    ct = ct +1;
            }
            list.add(ct == n);
            temp = 0;
            ct = 0;
        }
        return list;
    }
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;
//        KidsWithCandies(candies,extraCandies);
        System.out.println((KidsWithCandies(candies,extraCandies)));
    }
}
