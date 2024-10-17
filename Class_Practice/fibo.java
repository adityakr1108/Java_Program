class fibo{
    public static void main(String [] args){
        int fib = 7;
        System.err.println(fiibonacci(fib));
    }

    public static int fiibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int result = fiibonacci(n-1) + fiibonacci(n-2);
        return result;
    }

}