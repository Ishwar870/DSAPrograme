package Array;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = {8,1,0,1,3,2,0,3};
        int n = arr.length;
        printArray(arr,n);
        moveZero(arr,n);
        printArray(arr,n);
    }

    private static void printArray(int[] arr, int n) {
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    private static void moveZero(int[] arr, int n) {
        int j =0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }

}
