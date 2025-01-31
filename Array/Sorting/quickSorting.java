package Array.Sorting;

public class quickSorting {
 public static void main(String[] args) {
    int arr[] = {3,8,1,5,7};
    int ei = arr.length-1;
    quickSort(arr,0,ei);
    for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
 }   
 public static void quickSort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int pIDX = partition(arr,si,ei);
    quickSort(arr, si, pIDX-1);
    quickSort(arr, pIDX+1, ei);
 }  
 public static int partition(int arr[],int si,int ei){
    int pivot= arr[ei];
    int i = si-1;
    for(int j = si; j<ei;j++){
        if(arr[j] <= pivot){
            i++; // to make place for swapped elements
            //swap;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp; 
    return i;
 }

}
