package SearchingAlgo;

import java.util.Scanner;

public class SearchInsertPosition {
    public static int searchInsert(int arr[] , int target){
        int low = 0 , high = arr.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
//    public static void printArray(int arr[]){
//        int n = arr.length;
//        for (int i =0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int arr[] = {1,3,5,6};
        int target = 2;

//        printArray(arr);
        System.out.println(searchInsert(arr,target));
    }
}
// example 1
//input = [1,3,5,6] target = 5
//output = 2
//example 2
//input = [1,3,5,6] target 2
//output = 1
// example 3
//input = [1,3,5,6]  target 7
//output = 4
