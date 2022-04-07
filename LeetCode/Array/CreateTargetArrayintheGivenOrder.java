package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArrayintheGivenOrder {
    public static int[] createTargetarray(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i< nums.length;i++){
            list.add(index[i], nums[i] );
        }
        int result[] = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int index[] = new int[n];
        for(int i =0;i<n ; i++){
            nums[i] = sc.nextInt();
        }
        for (int i =0;i<n;i++){
            index[i] = sc.nextInt();
        }
//        createTargetarray(nums , index);
        System.out.println(Arrays.toString(createTargetarray(nums , index)));
    }
}
