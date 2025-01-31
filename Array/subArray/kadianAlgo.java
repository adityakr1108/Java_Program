package Array.subArray;
import java.util.Scanner;
public class kadianAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
int currSum = 0;
int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){ 
            currSum += arr[i];
        if(arr[i] < 0){
             currSum = 0;
        }
        maxSum = Math.max(maxSum,currSum);
        }
        System.out.println("Max Subarray : " + maxSum);
        sc.close();
    }
}

