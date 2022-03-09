package Array;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
         String pairs = maxProduct(arr);
        System.out.println(pairs);

    }
    public static String maxProduct(int arr[] ){
        String pairs = "";
        int maxProduct = 0;
        for (int i =0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]*arr[j] > maxProduct){
                    maxProduct = arr[i]*arr[j];
                    pairs = Integer.toString(arr[i]) + " , " + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }
}
