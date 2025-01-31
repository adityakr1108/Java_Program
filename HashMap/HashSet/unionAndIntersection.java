import java.util.*;
class unionAndIntersection{
    public static void main(String[] args){
        int arr[] = {7,3,9};
        int arr1[] = {6,3,9,2,9,4};

        HashSet<Integer> union = new HashSet<>();
        for(int it : arr){
            union.add(it);
        }
        for(int it : arr1){
            union.add(it);
        }
        System.out.println(union);

        HashSet<Integer> first = new HashSet<>();
        for(int it : arr){
            first.add(it);
        }
        HashSet<Integer> second = new HashSet<>();
        for(int it : arr1){
            second.add(it);
        }

        ArrayList<Integer> intersection = new ArrayList<>();
        for(int it : first){
            if(second.contains(it)){
                intersection.add(it);
            }
        }

        System.out.println(intersection);

        // 2nd method for intersection

        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int count = 0;
         for(int i = 0; i< arr1.length;i++){
            if(set.contains(arr1[i])){
                count++;
                set.remove(arr1[i]);
            }
         }
         System.out.println(count);
        

    }
}