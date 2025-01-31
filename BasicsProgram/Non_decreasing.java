package BasicsProgram;
 import java.util.Scanner;
public class Non_decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean check = false;
        for(int i =0 ;i<arr.length-2;i++){
            if(arr[i] <= arr[i+1]){
                check = true;
            }
        }
        System.out.println(check);
        sc.close();
    }
}
