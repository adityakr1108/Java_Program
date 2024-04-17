package Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class queueUsingJavaCollectionFrameWork {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        Queue<Integer> q1 = new ArrayDeque<>();
        // since Queue is not a class, it is an interface so we cant create an objects.
        // We can implement queue in two ways : 1- Linked List , 2- ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }


    }
}
