package BasicsProgram;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the elements into the array...");
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int arr1[] = new int[arr.length];
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n-1;j++){
                if(arr[i] != arr[j]){
                    arr1[i++] = arr[i];
                }
            }
        }
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        sc.close();
    }

}
