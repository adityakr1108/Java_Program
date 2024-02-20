package Array.Practice;

import java.util.Scanner;

public class reversewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array...");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
                int temp;
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        for(int i = 0;i<arr.length;i++){
            System.out.println("Elements after reversing: "+ arr[i] + " ");
        }
        sc.close();
    }
}