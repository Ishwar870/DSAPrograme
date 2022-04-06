package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Input: nums = [1,2,3,4]
//        Output: [2,4,4,4]
//        Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//        The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//        At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i =0;i< nums.length;i=i+2){
            int freq = nums[i];
            int val = nums[i+1];
           for (int j=0;j<freq;j++){
               list.add(val);
           }
        }
        int ans[] = new int[list.size()];
        for (int  i =0;i< list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
            int nums[]= {1,2,3,4};
            decompressRLElist(nums);
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }
}
