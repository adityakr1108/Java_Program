import java.util.*;
class validAnagram{
    public static void main(String[] args){
        HashMap<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        for(int i = 0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i = 0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
        }
        if(map.isEmpty()){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}

