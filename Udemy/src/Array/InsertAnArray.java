package Array;

public class InsertAnArray {
    static int[] arr = null;

    public  InsertAnArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public   void insert(int loacation, int valueToBeInsert){
        try{
            if (arr[loacation] == Integer.MIN_VALUE){
                arr[loacation] = valueToBeInsert;
                System.out.println("Success");
            }else{
                System.out.println("Occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid");
        }
    }
    public void traversal(){
        try{
            for (int i=0;i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }}
        catch (Exception e){
            System.out.println("Array no longer exixts");
        }
    }
    public static void searchInArray(int valueToBeSearch){
        for (int i=0; i < arr.length; i++){
            if(arr[i] == valueToBeSearch){
                System.out.println("\nvalue is find at the index of " + i );
                return;
            }
        }
        System.out.println( "\n" + valueToBeSearch + " value is not found");
    }
    public static void DeleteArray(int valueToDelete){
        try {
            arr[valueToDelete] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the value is provided that is not in range of array");
        }
    }
    public static void main(String[] args) {
        InsertAnArray sda = new InsertAnArray(10);
        sda.insert(1,4);
//        sda.insert(2,5);
//        sda.insert(2,6);
        sda.insert(4,7);
//        sda.insert(15,8);
        int firstelement = sda.arr[1];
        System.out.println(firstelement);
        int secondElement = sda.arr[4];
        System.out.println(secondElement);
        sda.traversal();
        searchInArray(23);
        DeleteArray(20);
    }

}
