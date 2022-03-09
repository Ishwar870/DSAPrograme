package Array;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i=0;i< n;i++){
            for (int j=0;j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        String s2DArray[][] = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(s2DArray));

    }
}
//Total time complexity = O(MN)
