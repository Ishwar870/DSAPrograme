package Arrays;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length-1;
       for (int i =0;i<mat.length;i++){
           sum += mat[i][i];
           if ((n-i) == i){
              continue;
           }
           sum += mat[i][n-i];
       }


        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(arr);
        System.out.println(diagonalSum(arr));
    }
}
