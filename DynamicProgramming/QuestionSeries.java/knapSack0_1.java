import java.util.*;
class knapSack0_1{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int W = sc.nextInt();
      int val[] = new int[n];
      int wt[] = new int[n];
      for(int i = 0;i<n;i++){
        val[i] = sc.nextInt();
        wt[i] = sc.nextInt();
      }

        System.err.println(solveKnapSacK(val, wt, W, val.length));

    }
    public static int solveKnapSacK(int val[],int wt[],int W,int n){
        if(W == 0 || n == 0){
            return 0;
        }
        if(wt[n-1]<= W){
            int ans1 = val[n-1] + solveKnapSacK(val, wt, W-wt[n-1], n-1);
            int ans2  = solveKnapSacK(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        }

        else{
            return solveKnapSacK(val, wt, W, n-1);
        }
    }
} 