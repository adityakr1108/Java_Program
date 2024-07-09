import java.util.*;
class iterniaryTickets{
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Banglore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String from = "";
        Set<String> set = map.keySet();
        for(String st : set){
            if(!map.containsValue(st)){
                from = st;
                break;
            }
        }
        LinkedHashSet<String> ans = new LinkedHashSet<>();
        ans.add(from);
        int i = 0;
        while(i < map.size()){
            ans.add(map.get(from));
            from = map.get(from);
            i++;
        }
        System.out.println(ans);
        

    }
}