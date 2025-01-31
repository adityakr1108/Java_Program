
import java.util.Arrays;

class fib{
    static int dp[];
    public static void main(String[] args){
        int n = 6;
        dp  = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n));
    }
    public static  int fibo(int n){
        if(n == 0 || n == 1){
            dp[n] = n;
        }
        if(dp[n] != -1){
            return dp[n]; 
        }
        return dp[n] = fibo(n-1) + fibo(n-2);
    }

}
