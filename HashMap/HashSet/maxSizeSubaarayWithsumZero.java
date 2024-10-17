import java.util.*;
class maxSizeSubarrayWithsumZero{ 
    public static void main(String[] args){
        int arr[] = {15,-2,2,-8,1,7,10,23};
        // int max = 0;
        // ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        // for(int i = 0; i<arr.length;i++){
        //     int sum = 0;
        //     // int j = 0;
        //     for(int j = i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum == 0){
        //         max = Math.max(max, j-i+1);
        //             ArrayList<Integer> temp = new ArrayList<>();
        //             for(int k = i;k<=j;k++){
        //             temp.add(arr[k]);
        //             }
        //             al.add(temp);
        //         }
        //     }
        // }
        // System.err.println(al);
        // System.out.println(max);

        //

        // throughHashMap();

        HashMap<Integer,Integer> hm = new HashMap<>();
        int target = 0;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            hm.put(i,arr[i]);
            if(sum == target){
                Set<Integer> keys = hm.keySet();
                for(int key:keys){
                    if(hm.get(key) == sum){
                        System.out.println(key);
                    }
                }
            }
            hm.clear();
        }
    }
}