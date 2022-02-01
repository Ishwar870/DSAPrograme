package GeeksForGeeksProblemDay;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheHeight {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int arr[] = {7 , 12, 3};
        int n = arr.length;
        int k = 8;
//        for (int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        System.out.print(getMinizeTheHeight(arr, n , k));
    }

    private static int getMinizeTheHeight(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int minimize = arr[0] + k;
        int maximize = arr[n-1] - k;
        int temp = 0;
        if(minimize > maximize){
            temp = minimize;
            minimize = maximize;
            maximize = temp;
        }
        for (int i=1;i<n;i++){
            int difference = arr[i] -k;
            int sum = arr[i] +k;
            if(difference >= minimize || sum <= maximize)
                continue;
            if(maximize - difference <= sum - minimize)
                minimize = difference;
            else
                maximize = sum;
        }
        return Math.min(diff, maximize - minimize);
    }
}
