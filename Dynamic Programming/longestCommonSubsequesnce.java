import java.util.*;
import javax.sound.sampled.SourceDataLine;
import javax.swing.text.DefaultStyledDocument;
class longestCommonSubsequesnce{
    public static String s = "";
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int m = s1.length();
        int n = s2.length();
    //    System.err.println(lcs(s1,s2,m,n));
    //    System.out.println(s);


       // tabulation solution 


       int dp[][] = new int[m+1][n+1];

       for(int i = 0; i<=m;i++){
        dp[i][0] = 0;
       }
       for(int i = 0; i<=n;i++){
        dp[0][i] = 0;
       }

       for(int i = 1;i<=m;i++){
        for(int j = 1;j<=n;j++){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                dp[i][j] = 1+dp[i-1][j-1];
            }
            else{
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       }
        System.out.println(dp[m][n]);

      
    }

    public static int lcs(String s1, String s2, int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            s += s1.charAt(m-1);
            return 1 + lcs(s1, s2, m-1, n-1);
        }
        else{
            return Math.max(lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
        }
    }
}