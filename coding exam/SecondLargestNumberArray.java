package Array;

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        int arr[] = {2,34,33,65,23,20};
        System.out.print(SecondLargest(arr));
    }

    private static int SecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                 secondMax = max;
                 max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax =arr[i];
            }
        }
        return secondMax;
    }
}
