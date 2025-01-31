package Array.subArray;
import java.util.Scanner;

public class minSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array...");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements...");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(minSum>currSum){
                    minSum = currSum;
                }
            }
        }

        System.out.println("Min subarray is "+ minSum);
        sc.close();
    }
}
