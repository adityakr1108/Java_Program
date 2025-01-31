package BasicsProgram;
import java.util.Scanner;

public class producct {
    public static void product(int a,int b){
        System.out.println("Product of "+ a + " and " + b + " = " + a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        product(a, b);
        sc.close();
    }
    
}
