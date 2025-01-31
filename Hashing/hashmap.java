
import java.util.*;

class hashmap{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2); 
        map.put("C",3); 
        map.put("D",4); 
        map.put("E",5);
        System.out.println(map.get("A"));

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
    }
}