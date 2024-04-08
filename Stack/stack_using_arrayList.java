package Stack;
import java.util.*;
public class stack_using_arrayList {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty(){
        return list.size() == 0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        stack_using_arrayList s  = new stack_using_arrayList();
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        while(!stack_using_arrayList.isEmpty()){
            System.out.println(s.peek());
            s.pop();
            
        }
        
    }
    
}
