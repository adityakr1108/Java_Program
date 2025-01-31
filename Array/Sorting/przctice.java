package Array.Sorting;
import java.util.Scanner;
;public class przctice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i = 0; i<n-1;i++){
        int smallestElement = i;
        for(int j = i+1;j<n;j++){
            if(arr[smallestElement] > arr[j]){
                smallestElement = j;
            }
            
        }
        int temp = arr[smallestElement];
        arr[smallestElement] = arr[i];
        arr[i] = temp;
        
    }
    for(int i = 0;i<n;i++){
        System.out.println(arr[i]);
    }
    sc.close();
    }
}
