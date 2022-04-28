package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearrya {
    public static void reverse(int arr[] ,int n, int k){
//        int n = arr.length;

            for (int i = 0; i < n; i += k) {
                    int l = i;
                    int r = Math.min(i + k - 1, n - k);

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
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
       int k = sc.nextInt();

       reverse(arr,n,k);
       for (int i =0;i< n;i++){
           System.out.print(arr[i] + " ");
       }

    }
}
