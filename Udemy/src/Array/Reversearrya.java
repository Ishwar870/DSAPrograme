package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearrya {
    public static void reverse(int arr[] ,int n, int k){
//        int n = arr.length;

            for (int i = 0; i < n; i += k) {
                    int l = i;
                    int r = Math.min(i + k - 1, n - 3);

                        while (l < r) {
                            int temp = arr[l];
                            arr[l] = arr[r];
                            arr[r] = temp;
                            l += 1;
                            r -= 1;
                        }

            }
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int n  = arr.length;
       int k = 4;

       reverse(arr,n,k);
       for (int i =0;i< n;i++){
           System.out.print(arr[i] + " ");
       }

    }
}
