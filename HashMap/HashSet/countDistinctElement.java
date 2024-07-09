import java.util.*;
class countDistinctElement{
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}