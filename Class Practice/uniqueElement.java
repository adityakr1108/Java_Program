import java.util.*;
class uniqueElement{
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,6,6,7};
        int n = arr.length;
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[0]);
        int i = 1;
        while(i<arr.length){
            if(arr[i] != arr[i-1]){
                ar.add(arr[i]);
            }
            i++;
        }

            for(int x : ar){
                System.out.print(x + " ");
            }
        }
    }
