import java.util.*;
class MaxSizeSubarraywithSumK{
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {1,2,3};
        int k = 3;
        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                len++;
            }
        }
        System.out.println(len);

    }
}