import java.util.*;
class frogJump{
    // static int dp[];
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     // int k = sc.nextInt();
    //     // int arr[] = new int[n];
    //     // for(int i = 0; i<n;i++){
    //     //     arr[i] = sc.nextInt();
    //     // }
    //     dp = new int[n];
    //     Arrays.fill(dp,-1);

    //     System.out.println(jump(0,n,k,arr));

    // }
    // static int jump(int i, int n, int k,int [] arr){

    //     if(i == n-1){
    //         return 0;
    //     }
    //     int ans = Integer.MAX_VALUE;
    //     if(dp[i] != -1){
    //         return dp[i];
    //     }
    //     for(int j = 1 ; j<= k;j++){
    //         int net = i+j;
    //         if(net < n){
    //             ans = Math.min(ans,jump(net,n,k,arr) + Math.abs(arr[i]-arr[net]));
    //         }
    //     }
    //     return dp[i] = ans;


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    
    int dp[] = new int[n+1];
    dp[n-1] = 0;
    for(int i = n-2 ; i>=0;i--){
      int ans = Integer.MAX_VALUE;
      for(int j = 1 ;j<=k;j++){
        int net = i+j;
        if(net < n){
        ans = Math.min(ans,dp[net]+Math.abs(arr[net]-arr[i]));
        }
      }
      dp[i] = ans;
    }
    System.out.println(dp[0]);
    
  }
}