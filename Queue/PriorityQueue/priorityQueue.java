
import java.util.Collections;
import java.util.PriorityQueue;

class priorityQueue{
    public static void main(String[] args) {
        // min heap impletation 

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(12);
        pq1.add(15);

        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }


        // max heap impletation 


        PriorityQueue<Integer> maxHeap  = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(12);
        maxHeap.add(15);
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }


    }
}