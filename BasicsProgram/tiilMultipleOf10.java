package BasicsProgram;
import java.util.Scanner;

// public class tiilMultipleOf10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         do{
//         n = sc.nextInt();
//     }
//     while(n%10==0);
// sc.close();
// }
// }

public class tiilMultipleOf10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n%10!=0){
                break;
            }
        }while(true);
        sc.close();
    }
}