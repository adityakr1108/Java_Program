package BasicsProgram;
import java.util.Scanner;

public class sumloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int even = 0;
        int odd = 0;
        for(int i = 0; i<inp;i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
        }
System.out.println("Sum of even no till "+ inp + " "+ even);
System.out.println("Sum of even no till "+ inp + " "+ odd);
sc.close();
    }
    
}
