package Array;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int arr[] = new int[3]; //-----------------O(1)
        arr[0] = 1; //--------------O(1)
        arr[1] = 2; //--------------O(1) ----------------O(N)
        arr[2] = 3; //--------------O(1)
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<3;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
//Total Time Complexity = O(N)