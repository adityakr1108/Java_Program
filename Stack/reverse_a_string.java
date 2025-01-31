package Stack;
import java.util.*;
public class reverse_a_string{
public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);
    String str  = sc.nextLine();
    int i = 0;
    while(i<str.length()){
        stack.push(str.charAt(i));
        i++;
    }
    StringBuilder result = new StringBuilder("");
    while(!stack.isEmpty()){
        result.append(stack.pop());
    }
    System.out.println(result);
    sc.close();
}
}