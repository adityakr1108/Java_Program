class knapSackMemeeo{
    public static void main(String[] args){
        int val[] = {15,14,10,45,30};
        int w[] = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0; j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapSack(val,w,W,val.length,dp));
    }
    static int knapSack(int [] val,int []w,int W,int n,int [][] dp){
        if(n == 0 || W == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(w[n-1] <= W){
            int ans = val[n-1] + knapSack(val, w, W-w[n-1], n-1, dp);
            int ans2 = knapSack(val, w, W, n-1, dp);
            return dp[n][W] = Math.max(ans,ans2);
        }
        else{
            return dp[n][W] = knapSack(val, w, W, n-1, dp);
        }
    }
}