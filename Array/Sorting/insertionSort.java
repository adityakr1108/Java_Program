package Array.Sorting;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
    System.out.println("Enter the size of array..");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements..");
    for(int i = 0; i<arr.length;i++){
        arr[i] = sc.nextInt();
    }        
    for(int i = 1; i<arr.length;i++){
        int prev = i-1;
        int current = arr[i];
        while(prev >= 0 && arr[prev] > current){    // sorting in ascending order
            // while(prev >= 0 && arr[prev] < current)] ->>> sorthing in descending order
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev + 1] = current;
    }
    System.out.println("Elements after insertion sorting...");
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    sc.close();
    }
    
}
