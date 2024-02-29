package Recursion;

public class arraySortCheck {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,4};
        System.out.println(check(arr,0));
    }

    public static boolean check(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return check(arr,i+1);
    }
}
