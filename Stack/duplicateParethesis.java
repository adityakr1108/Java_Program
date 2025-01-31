package Stack;
import java.util.*;
public class duplicateParethesis {
    public static Boolean duplicate(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i<str.length()){
            char ch = str.charAt(i);
            // closing condition
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '(' ){
                    s.pop();
                    count++;
                }
            if(count < 1){
                return true;
            }
            else{
                s.pop();
            }
        }
        // opening condition
        else{
            s.push(ch);
        }
        i++;
    }
    return false;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(duplicate(str));
    sc.close();
    }
}
