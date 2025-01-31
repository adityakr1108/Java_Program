package BasicsProgram;
import java.util.Scanner;

// public class factorial {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fact(n);
//         System.out.println("Factrorial Of no til6 user input is " + n + " " +fact(n));
//     }

//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         else{
//             return n * fact(n-1);
//         }
//     }
    
// }



// another method
public class factorial{
public static void main(String[] args){
    int i,fact = 1;
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        for(i = 1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of no till user input is.."+ n + " " + fact );
        sc.close();
    }
}
}