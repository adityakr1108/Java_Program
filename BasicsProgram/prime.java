package BasicsProgram;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the no to check weather it is prime or not..");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n + " is a prime no.");
        }
        else{
            System.out.println(n + " is not  a prime no..");
        }
        sc.close();

    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }   
        }
        return true;
    }
}
