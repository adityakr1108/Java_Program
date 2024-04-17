package Queue;
import java.util.*;
// implemtation of queue using 2 stack through push(O(n))
public class queueUsingTwoStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    public static int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }

    public static void main(String[] args) {
        
        queueUsingTwoStacks q = new queueUsingTwoStacks();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6); 

        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
