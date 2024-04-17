package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class stackAndQueueUsingDeque {
    public static Deque<Integer> dq = new LinkedList<>();
    public static boolean isEmpty(){
        return dq.isEmpty();
    }
    public static void push(int data){
        dq.addLast(data);
    }
    public static int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = dq.removeLast();
        return data;
    }
    public static int top(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return dq.getLast();
    }
    public static void add(int data){
        dq.addLast(data);
    }
    public static int remove(){
        return dq.removeFirst();
    }
    public static int peek(){
        return dq.getFirst();
    }

    public static void main(String[] args) {

       // Operation on stack
        stackAndQueueUsingDeque d = new stackAndQueueUsingDeque();
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        while(!d.isEmpty()){
            System.out.print(d.top());
            d.pop();
        }
        System.out.println();

        // Operation on queue
        stackAndQueueUsingDeque d1 = new stackAndQueueUsingDeque();
        d1.add(1);
        d1.add(2);
        d1.add(3);
        d1.add(4);
        while(!d1.isEmpty()){
            System.out.print(d1.peek());
            d1.remove();
        }
    }
}
