package Queue;
import java.util.*;
public class doubleEndedQueue {
    public static void main(String[] args) {
       Deque<Integer> dq = new LinkedList<>();
       dq.addFirst(1);
       System.out.println(dq);
       dq.addFirst(3);
       System.out.println(dq);
       dq.addFirst(5);
       System.out.println(dq);
       dq.addFirst(7);
       System.out.println(dq);
       dq.addLast(2);
       System.out.println(dq);
       dq.addLast(4);
       System.out.println(dq);
       dq.addLast(6);
       System.out.println(dq);
       dq.addLast(8);
       System.out.println(dq);
       dq.removeFirst();
       System.out.println(dq);
       dq.removeLast();
       System.out.println(dq);

       System.out.println(dq.getFirst());  
       System.out.println(dq.getLast());
    }
}
