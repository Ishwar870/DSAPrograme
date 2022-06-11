package Array;

import java.util.Arrays;

public class Duplicate {
    public static int removeDuplicate(int a[] , int n){
        Arrays.sort(a);
        if (n == 0 || n == 1){
            return n;
        }
//        int[] temp = new int[n];
        int j = 0;
        for (int i =0 ;i<n-1;i++){
            if (a[i] != a[i+1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n-1];

        return j;
    }
    public static void main(String[] args) {
        int a[] = {4, 2, 40, 10, 10, 2, 1, 4, 2, 1, 10, 4, 40, 20};
        int n = a.length;
        int j =0;
        j = removeDuplicate(a,n);
        for (int i=0;i<j;i++){
            System.out.print(a[i] + " ");
        }
    }
}
