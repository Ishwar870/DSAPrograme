package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {3,24,34,22,9}; // 1
        PrintArray(arr);// 1
        insertion(arr);// 1
        PrintArray(arr);// 1
    }

    private static void insertion(int[] arr) {
        int n = arr.length;// 1
        for(int i =1; i<n;i++){// n+1
            int temp = arr[i];// 1
            int j = i-1;// 1
            while (j >= 0 && arr[j] > temp){// n+1
                arr[j+1] = arr[j];// 1
                j = j-1;//1
            }
            arr[j+1] = temp;// 1
        }
    }

    private static void PrintArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n;i++){// n
            System.out.print(arr[i] + " ");// 1

        }
        System.out.println();// 1
    }
}
