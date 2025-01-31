public class LinkedListI_II {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
     public void addAtFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp= head;
        while(temp  != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
        
    }  
public static boolean detectCycle(){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow==head){
            return true;
        }
    }
    return false;
}

public static void removeCycle(){
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            cycle = true;
            break;
        }
    }
    if(cycle == false){
        return;
    }
    Node prev = null;
    slow = head;
    while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
    prev.next = null;
}

    public static void main(String[] args) {
    
       head = new Node(4);
       head.next = new Node(5);
       Node temp = new Node(6);
       head.next.next = temp;
       head.next.next.next = new Node(8);
       head.next.next.next.next = temp;
       System.out.println(detectCycle());
       removeCycle();
       System.out.println(detectCycle());


        
    }
}
