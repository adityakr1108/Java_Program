package Recursion;

public class sumOfnNatural {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNumber(n));
    }
    public static int sumOfNumber(int n){
        int sum = 0;
            if(n == 1){
                return 1;
            }
          sum =  n + sumOfNumber(n-1);
           return sum;
    }
    
}
