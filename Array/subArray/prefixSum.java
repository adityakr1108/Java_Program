package Array.subArray;
import java.util.Scanner;
public class prefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int prefixArray[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        prefixArray[0] = arr[0];
        for(int i = 1;i<prefixArray.length;i++){
            prefixArray[i] =  prefixArray[i-1] + arr[i];
        }
        System.out.println("Min SubArray: "+ prefixArray[0]);
        System.out.println("Max SubArray: " + prefixArray[prefixArray.length -1]);

        for(int i = 0;i<arr.length;i++){
            System.out.println(prefixArray[i]);
        }
// 2nd approach to find the min and max subarray
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            int start = i;
            int currSum = 0;
            for(int j = 0;j<arr.length;j++){
                int end = j;
                currSum = start == 0? prefixArray[end] : prefixArray[end] - arr[start-1]; 
            }
            if(maxSum<currSum){
                maxSum = currSum;
            }
            if(currSum < minSum){
                minSum = currSum;
            }
        }       
        System.out.println("Max subarray: " + maxSum);
        System.out.println("Min subarray: " + minSum);
        sc.close();
    }
}
