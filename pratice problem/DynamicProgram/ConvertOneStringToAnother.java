package DynamicProgramme;

public class ConvertOneStringToAnother {
    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        int m = 3;
        char x[] = {'w','a','r'};
        int n = 4;
        char y[] = {'g','e','a','r'};
        int len = lcs.LCS(m,x,n,y);
        int del = m-len;
        int insert = n-len;
        System.out.println("Minimum Deletion "+del );
        System.out.println("Minimun Insertion " + insert);
    }
}
