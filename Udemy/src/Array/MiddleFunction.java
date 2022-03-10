package Array;

import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4};
//    int result = middleFun(arr);
        System.out.println(Arrays.deepToString(new int[][]{middleFun(arr)}));
    }
    public static int[] middleFun(int arr[]){
        return Arrays.copyOfRange(arr , 1,arr.length-1);
    }
}
