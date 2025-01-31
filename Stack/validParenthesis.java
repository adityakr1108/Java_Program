package Stack;
import java.util.*;
public class validParenthesis {
    public static boolean valid(){
        Stack<Character> par = new Stack<>();
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            int i = 0;
            while(i<str.length()){
                char ch = str.charAt(i);
                if(ch == '(' || ch == '{' || ch == '['){
                    par.push(ch);
                }
                else{
                    if(par.isEmpty()){
                        return false;
                    }
                    if((par.peek() == '(' && ch == ')') || (par.peek() == '{' && ch == '}') || (par.peek() == '[' && ch == ']') ){
                        par.pop();
                    }
                    else{
                        return false;
                    }
                }

                i++;
            }
            sc.close();
        }
        if(par.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
     System.out.println(valid());   
    }
}
