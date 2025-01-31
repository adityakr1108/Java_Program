package Doubly_Linked_List;

public class doubleLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
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
        head.prev = newNode;
        head = newNode;
    }
    public void removeAtLast(){
        if(head == null){
            return;
        }
        tail.prev.next = null;
        size--;

    }
    public void removeAtFirst(){
        if(head == null){
            System.out.println("Dl is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        head.next.prev = null;
        size--;
    }
    public void reverse(){
        if(head == null){
            System.out.println("Reverse");
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!= null){
            next= curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<=>");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        doubleLinkedList db = new doubleLinkedList();
        db.addAtFirst(1);
        db.addAtFirst(2);
        db.addAtFirst(3);
        db.addAtFirst(4);
        db.addAtFirst(5);
        db.addAtFirst(6);
        db.addAtFirst(7);
        db.print();
      //  db.removeAtFirst();
        db.print();
      //  db.removeAtLast();
        db.print();
        db.reverse();
        db.print();
    }
    
}
