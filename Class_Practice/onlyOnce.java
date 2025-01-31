
import java.util.*;
class onlyOnce{
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,6,6,7};
        int i = 1;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        while(i < arr.length-1){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1])
            al.add(arr[i]);
            i++;
        }
        for(int x : al){
            System.out.println(x);
        }
    }
} 