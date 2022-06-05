package Math;

public class CellswithOddValuesinaMatrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int ans[][] = new int[m][n];
        for (int i =0;i<indices.length;i++){
            for (int j =0;j<n;j++){
                ans[indices[i][0]][j]++;
            }
            for (int j =0;j<m;j++){
                ans[j][indices[i][1]]++;
            }
        }
        int couunt = 0;
        for (int i =0;i<m;i++){
            for (int j =0;j<n;j++){
                if(ans[i][j] % 2 != 0){
                    couunt++;
                }
            }
        }
        return couunt;
    }
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int indices[][] = {{1,1},{0,0}};
        System.out.println(oddCells(m,n,indices));
    }
}
