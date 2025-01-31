import java.util.*;
class fibo{
    static int []dp;

    public static void main(String[] args) {
        int n = 6;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        fibonacciSeries(n);
        for(int i : dp){
            System.out.println(i);
        }
    }
    public static int fibonacciSeries(int n){
        if(dp[n] != -1) return dp[n];

        if (n == 0 || n == 1) {
            return dp[n] = n;
        }
        return dp[n] = fibonacciSeries(n-1) + fibonacciSeries(n-2);

    }

}