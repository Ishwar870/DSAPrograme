package Arrays;

import java.util.Scanner;
//input = 8 16 9
//output = 0+4+3 = 7
public class PerfectSquareCal {
    public  static int perfect(int arr[]){
        int n = arr.length;
        int count = 0;
        for (int i =0;i<n;i++){
            int sr = (int) Math.sqrt(arr[i]);
            if((sr * sr) == arr[i]) {
                count += sr;
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
        perfect(arr);
        System.out.println(perfect(arr));
    }
}
