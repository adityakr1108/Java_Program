class climbingStairs{
    // static int dp[];


    // through Memeorization.....
    // public static void main(String[] args){
    //     int n =3;
    //     int []dp = new int[n+1];
    //     Arrays.fill(dp,-1);
    //     countOfSteps(n,dp);
    //     System.out.println(dp[n]);
    // }
    // private static  int countOfSteps(int n,int []dp){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }
    //     if(dp[n] != -1){
    //         return dp[n];
    //     }
    //     dp[n] =   countOfSteps(n-1, dp) + countOfSteps(n-2, dp) + countOfSteps(n-3, dp);
    //     return dp[n];

    // }

    // trhrogh memeorization...
    public static void main(String[] args){
        int n = 20;
        int dp[]  = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
              for(int i = 3;i<=n;i++){
                dp[i] = dp[i-1] + dp[i-2];
              }  
                System.out.println(dp[n]);
    }
}