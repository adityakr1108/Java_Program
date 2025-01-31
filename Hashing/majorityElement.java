import java.util.*;
class majorityElement{
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        
        int elementGreterThan = arr.length/3;
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> key = map.keySet();
        // System.out.println(key);
        for(int a : key){
            if(map.get(a) > elementGreterThan){
                ans.add(a);
            }
        }
        System.out.println(ans);
    }
}