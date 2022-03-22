package DynamicProgramme;

import java.util.Scanner;

public class MinimumNumberOfJumps {
    public static int minJump(int n , int[] arr){
        int jump[] = new int[n];
        jump[0] = 0;
        for (int i =1;i<n;i++){
            jump[i] = Integer.MAX_VALUE;
        }
        for (int i =1;i<n;i++){
            for (int j=0;j<i;j++){
                if (arr[j] + j >= i ){
                    if (jump[j]+1 < jump[i]){
                        jump[i] = jump[j]+1;
                    }
                }
            }
        }
        return jump[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minJump(n,arr));
    }
}
