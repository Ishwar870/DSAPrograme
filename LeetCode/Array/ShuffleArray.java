package Arrays;

import java.util.Arrays;

public class ShuffleArray {
public static int[] shuffle(int[] arr , int n){
    int ans[] = new int[arr.length];
    for (int i=0;i<n;i++){
       ans[2*i] = arr[i];
       ans[i*2+1] = arr[n+i];
    }
    return ans;
}
    public static void main(String[] args) {
     int array[] = {2,5,1,3,4,7};
     int n = 3;
     shuffle(array,n);
//     System.out.println(Arrays.toString(shuffle(array,n)));
    }
}
