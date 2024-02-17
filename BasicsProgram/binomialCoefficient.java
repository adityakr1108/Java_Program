package BasicsProgram;
import java.util.Scanner;

public class binomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value ");
        int n = sc.nextInt();
        System.out.println("Enter the r value ");
        int r = sc.nextInt();
        int bnup = factorail(n) / (factorail(r)*factorail(n-r));
        System.out.println("Binomial Coefficient of number n and r is : "+ bnup);
        sc.close();



    }
    public static int factorail(int a){
        int fact = 1;
     for(int i = 1;i<=a;i++){
        fact = fact*i;
     }   
     return fact;

    }
}
