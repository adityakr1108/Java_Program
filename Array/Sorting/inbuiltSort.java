package Array.Sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {
    public static void main(String[] args){
        int arr[] = {3,6,1,5,2};
        int arr1[] = {5,7,8,1,2};
        Integer arr2[] = {6,9,2,7,3};
        Integer arr3[] = {7,3,1,5,4};
        Arrays.sort(arr); //sort elements in reverse order
        Arrays.sort(arr1,0,4);
        Arrays.sort(arr2,Collections.reverseOrder());
        Arrays.sort(arr3,0,4,Collections.reverseOrder());
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]) ;   //
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr1[i]) ;   //
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr2[i]) ;   //
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr3[i]) ;   //
        }
    }
}
