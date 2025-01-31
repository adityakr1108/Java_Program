package Array.Search;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];
        
        for (int i = 0; i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no which you want to search...");
        int search = sc.nextInt();
        for(int i = 0;i<5;i++){
            if(arr[i] == search){
                System.out.println("Element found at index " + i + " Which is " + search);
                break;
            }
        }
        sc.close();
    }
}
