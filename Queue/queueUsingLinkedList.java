package Queue;

public class queueUsingLinkedList {
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue{

         static Node head = null;   
         static Node tail = null;

        public static boolean isEmpty(){
            return head == null &  tail == null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty...");
                return -1;
            }
            int data = head.data;
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return data;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty...");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while(!q.isEmpty()){
            System.out.print(q.peek() + "=>");
            q.remove();
            
        }
        System.out.println("Null");
    }
}
