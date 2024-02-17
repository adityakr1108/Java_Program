package Array.subArray;
import java.util.Scanner;
public class subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array...");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements...");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                System.out.print("[ ");
                for(int k=i;k<=j;k++){
                    System.out.print(" "+arr[k] + " ");
                }
                System.out.print(" ]");
                System.out.println();
            }
                
            System.out.println();
        }
        sc.close();
    }
}
