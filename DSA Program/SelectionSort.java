package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,23,5,7,9};
        PrintArray(arr);
        selectionSort(arr);
        PrintArray(arr);
    }

    private static void PrintArray(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
