package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SumOfNorepeatingArray {
    public static int findSum(int arr[], int n){
        int sum = 0;
        HashSet<Integer> s = new HashSet<>();
        for (int i =0;i<n;i++){
            if (!s.contains(arr[i])){
                sum += arr[i];
                s.add(arr[i]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findSum(arr, n));
    }
}
