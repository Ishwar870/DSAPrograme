package Array;

import java.util.Scanner;

public class WindowSliding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n = arr.length;

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max;
        // n = arr.length;
        for(int i=0; i <= n-k ; i++){
            max = arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j] > max)
                    max = arr[i+j];
            }
            System.out.print(max + " ");
        }
    }
}
