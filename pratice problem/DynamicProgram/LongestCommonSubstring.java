package DynamicProgramme;

public class LongestCommonSubstring {
    public static int LCST(int m , char[] x, int n , char[] y){
        int result = 0;
        int dp[][] = new int[m+1][n+1];
        for (int i =0;i<= m ;i++){
            for (int j=0;j<=n;j++ ){
                if (i==0||j==0){
                    dp[i][j] = 0;
                }else if (x[i-1] == y[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if (dp[i][j] > result){
                        result = dp[i][j];
                    }
                }else {
                    dp[i][j] = 0;
                }

            }
        }
        return result;
    }
    public static void main(String[] args) {
        int m = 10;
        char[] x = {'C','H','E','E','S','B','O','A','R','D'};
        int n = 5;
        char[] y = {'B','O','A','R','D'};
        System.out.println(LCST(m,x,n,y));
    }
}
