package BasicsProgram;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){
        int arr[] =new int[50];
        Scanner sc = new Scanner(System.in);
        arr[6] = 50; 
        for(int i = 0; i<=arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<=4;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }

    
    
}
