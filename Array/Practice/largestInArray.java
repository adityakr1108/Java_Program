package Array.Practice;
import java.util.Scanner;
public class largestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thje size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        int smallest = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
    
        System.out.println("Smallest value in the array is: "+ smallest);
        System.out.println("Largest value in the array is: "+ largest);
        sc.close(); 
    }
    
}
