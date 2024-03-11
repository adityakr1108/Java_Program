package Array.Sorting;
import java.util.Scanner;

public class sortedArrayques {
    public static void main(String[] args)
{
    int arr[] = {2,4,6,7,9};
    int ei = arr.length;
    int si = 0;
    search(arr,si,ei);
}    
public static void search(int arr[],int si,int ei){
    if(ei == 0){
        return;
    }
    int mid = (ei-si)/2;
    search(arr,si,mid);
    search(arr,mid+1,ei);
    result(arr,si,mid,ei);
}
public static int result(int arr[],int si,int mid,int ei){
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int i = si;
    int j = ei;
    while(terget)
    if(target < arr[i]){
        return i;
        i++; 
    }
    else{

    }
return 0;
}
}
