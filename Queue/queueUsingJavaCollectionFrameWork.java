package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class queueUsingJavaCollectionFrameWork {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        // since Queue is not a class, it is an interface so we cant create an objects.
        // We can implement queue in two ways : 1- Linked List , 2- ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
