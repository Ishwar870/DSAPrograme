package Arrays;

import java.util.Scanner;

public class CountGoodTriplets {
    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                for(int k =j+1;k<arr.length;k++){
                    if (Math.abs(arr[i] - arr[j]) <= a){
                        if (Math.abs(arr[j] - arr[k]) <= b){
                            if (Math.abs(arr[k] - arr[i]) <= c){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(countGoodTriplets(arr,a,b,c));
    }
}
