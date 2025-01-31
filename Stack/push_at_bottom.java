package Stack;
import java.util.*;
public class push_at_bottom {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    /* Fist Method using extra stack 
        Stack<Integer> stack1 = new Stack<>();
        while(!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        stack.push(4);
        while(!stack1.isEmpty()){
            stack.push(stack1.pop());
          
        }

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        } 
        */

        // 2nd method using recursion
            pushAtBottom(stack, 4);
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
    }
}
