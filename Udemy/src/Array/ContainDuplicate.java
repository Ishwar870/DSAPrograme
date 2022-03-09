package Array;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        System.out.println(isUnique(arr));
    }
    public static boolean isUnique(int[] arr){
        int n = arr.length;
        for (int i =0; i<n;i++){
            for (int j = i+1; j<n ; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
