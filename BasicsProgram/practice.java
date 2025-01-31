
 
import java.util.*;
public class practice {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
        int n  = sc.nextInt();
        // sc.nextLine();

        // String str = sc.nextLine();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int j =0;j<arr.length;j++){

            // int num = Integer.parseInt(marks[j]);

            sum += arr[j];
        }
        System.out.println("avg: "+(double)sum/n);
        sc.close();
}
}
