package Array;

public class FindElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        FindArray(arr, 6);
    }
    public static int FindArray(int arr[], int value){
        for (int i =0;i<arr.length;i++){
            if (arr[i] == value){
                System.out.println("Value found at the index of " + i);
                return i;
            }
        }
        System.out.println(value + " not found");
        return value;
    }
}
