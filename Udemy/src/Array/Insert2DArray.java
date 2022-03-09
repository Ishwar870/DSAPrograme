package Array;

import java.util.Arrays;

public class Insert2DArray {
    int arr[][] =  null;
    public Insert2DArray(int n, int m){
        this.arr = new int[n][m];
        for (int row =0;row < arr.length;row++){
            for (int col =0; col <arr[0].length;col++){
                arr[row][col]  = Integer.MIN_VALUE;
            }
        }
//        Time complexity = O(1) and space = O(MN)
    }
    public void insertValueAnArray(int row, int col, int value){
        try {
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The Value is Successfully inserted");
            }else {
                System.out.println("The cell is occupied");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index of 2D Array");
        }
//         Time complexity = O(1) and space = O(1)
    }
    public void accessingCell(int row , int col){
        System.out.println("\n Accessing Row# " + row + ", Col# " +col );
        try{
            System.out.println("Cell Value Is " + arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index of 2D Array");
        }
//         Time complexity = O(1) and space = O(1)
    }
//    Traverse 2D Arrays
    public void traverse2DArray(){
        int n = arr.length;
        int m = arr[0].length;
        for (int row = 0; row < n; row++){
            for (int col =0 ; col < m; col ++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
//        Time complexity = O(mn) and space = O(1)
    }
    public void SearchingValue(int value){
        int n = arr.length;
        int m = arr[0].length;
        for (int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                if (arr[i][j] == value){
                    System.out.println("The value " + value + " found at row " + i + ", col " + j );
                    return;
                }

            }
        }
        System.out.println("The Value is not found");
//         Time complexity = O(mn) and space = O(1)
    }
    public void Delete2DArray(int row ,int col){
        try {
            System.out.println("Successfully Deleted " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index is not valid for array");
        }
//         Time complexity = O(1) and space = O(1)
    }
    public static void main(String[] args) {
        Insert2DArray sda = new Insert2DArray(3 , 3);
        sda.insertValueAnArray(0,0,10);
        sda.insertValueAnArray(0,1,20);
        sda.insertValueAnArray(0,2,30);
        sda.insertValueAnArray(1,0,40);
        sda.insertValueAnArray(1,1,50);
        sda.insertValueAnArray(1,2,60);
        sda.insertValueAnArray(2,0,70);
        sda.insertValueAnArray(2,1,80);
        sda.insertValueAnArray(2,2,90);

        System.out.println(Arrays.deepToString(sda.arr));
//        sda.accessingCell(1,1);
        sda.traverse2DArray();
        sda.SearchingValue(60);
        sda.Delete2DArray(2,1);
        sda.traverse2DArray();
    }

}
