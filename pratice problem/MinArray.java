package Array;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {6,2,6,3,1};
        System.out.print(minArray(arr));
    }

    private static int minArray(int[] arr) {
        int min = arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
