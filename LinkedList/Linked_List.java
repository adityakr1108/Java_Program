import java.util.Scanner;

public class Linked_List {
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
    public void addAtFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("Null");
        
    }    
    public void addAtLast(int data){
        Node lastNode = new Node(data);
        if(head == null){
            head = tail = lastNode;
            return;
        }
        tail.next = lastNode;
        tail = lastNode;
    }
    public static void main(String[] args){
            Linked_List ll = new Linked_List();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of node to be inserted");
            int noOfNode = sc.nextInt();
            for(int i =0;i<noOfNode;i++){
                int no = sc.nextInt();
                ll.addAtFirst(no);
            }
            ll.addAtLast(7);
            ll.print();
            sc.close();
        }
}
