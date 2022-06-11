package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int insert = sc.nextInt();
        arr[n] = insert;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.print(arr[n]);

    }
}
