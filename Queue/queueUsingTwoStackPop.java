package Queue;
import java.util.*;
class queueUsingTwoStacksPop{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public void add(int data){
        s1.push(data);
    }

    public void remove(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }


    }
    public static void main(String[] args) {
        queueUsingTwoStacksPop q = new queueUsingTwoStacksPop();

    }
 }
