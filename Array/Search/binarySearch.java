package Array.Search;

import java.util.Scanner;


public class binarySearch {
    public static int binarySearchElement(int arr[],int key){
        int low = 0;
        int high = arr.length-1 ;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                high = mid-1;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no to search   ");
        int key = sc.nextInt();
        int k = binarySearchElement(arr, key);
        if(k==-1){
            System.out.println("Element not found in the array...");
        }
        else{
            System.out.println("Element found at index "+ k);
        }
        sc.close();
    }
}
