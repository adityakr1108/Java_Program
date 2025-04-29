import java.util.HashMap;
import java.util.Map;
class totalNoOfAnagram{
    public static void main(String[] args){
        HashMap<Character,Integer> mp = new HashMap<>();

        String txt = "forxxorfxdofr";
        String pat = "for";
        char []text = txt.toCharArray();

        int i = 0 ;
         while(i < text.length){
            int j = i;
            if(j-i+1 == pat.length()){
                i++;
                initialiseMap(mp,pat);
            }
            else{
                while(j < pat.length()){
                    if(mp.get(j) > 0 && mp.get(j) == text[j]{
                        mp.get(pat)--;
                    })
                }
            }
         }


    }
    static boolean isMapEmpty(HashMap<Character,Integer> mp){
        for(int i = 0;i<mp.size();i++){
            if(mp.get(i) != 0 ){
                return false;
            }
        }
        return true;
    }
    static void  initialiseMap(HashMap<Character, Integer> mp, String txt){
        for(int i = 0; i<txt.length();i++){
            mp.put(txt.charAt(i),mp.getOrDefault(txt.charAt(i),0)+1);
        }
    }
}