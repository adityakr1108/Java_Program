import java.util.*;
class MaxSizeSubarraywithSumZero{
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {15,2,-2,-8,7,1,10};
        int sum = 0;
        int len =0;
        for(int i = 0; i<arr.length;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum)){
                len = Math.max(len,i-map.get(sum));
            }
        }
        System.out.println(len);
    }
}