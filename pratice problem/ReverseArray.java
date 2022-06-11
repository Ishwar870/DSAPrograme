package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int number[] = {2,4,1,5,7};
        printArray(number);
        Reverse(number,0,number.length-1);
        printArray(number);
    }

    private static void Reverse(int[] number, int start, int end) {
        while (start < end){
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }

    }

    private static void printArray(int[] arr) {
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
}
