import java.util.*;
class subarrayWithSumK{
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int k = 7;
        int prefix[] = new int[arr.length];
        for(int i = 0;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        Map<Integer,Integer> mp = new HashMap<>();
        c
    }
}