class fib{
    public static void main(String[] args) {

        // basics program
            int a = 0;
            int b = 1;
            int fn = a+b;
            for(int i = 2;i<= 10;i++){
                System.out.println(fn);
                a = b;
                b = fn;
                fn= a+b;
            }
        // through Dynamic programming
        int n = 10;
        // 1st approach
        // top to bottom approach
        // int memo[] = new int[n+1]; -- memorization
        // for (int i = 0; i < memo.length; i++) {
        //     memo[i] = -1;
        // }
        //  System.out.println(fibi(n,memo));

        // 2nd approach
        // bottom to top approach - tabilation

        // int f[] = new int [n+1];
        // f[0] = 0;
        // f[1] = 1;
        // for(int i =2;i<=n;i++){
        //     f[i] = f[i-1] + f[i-2];
        // }
        // System.out.println(f[n]);
    }

    public static int fibi(int n, int[] memo) {
    if(memo[n] != -1) {
        return memo[n];
    }
    int res;
    if (n == 0 || n == 1) {
        res = n;
    } else {
        res = fibi(n - 1, memo) + fibi(n - 2, memo);
    }
    memo[n] = res;
    return res;
}




}