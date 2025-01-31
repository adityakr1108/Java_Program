package Queue;
import java.util.*;
public class firstNonRepeatingCharacter {
    public static void nonRepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            q.add(c);
            freq[c -'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+ " ");
            }
            else{
                System.out.print (q.peek() + " ");
            }
            
        }

    System.out.println();
    }  
    public static void main(String[] args) {
    String str = "aabccxb";
    nonRepeating(str);
}
}
