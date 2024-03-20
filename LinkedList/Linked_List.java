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
    public void addAtLast(int data){
        Node lastNode = new Node(data);
        size++;
        if(head == null){
            head = tail = lastNode;
            return;
        }
        tail.next = lastNode;
        tail = lastNode;
    }
    public void inserAtMiddle(int data,int index){
        if(index == 0){
            addAtFirst(data);
            return;
        }
        Node element = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        element.next = temp.next;
        temp.next = element;    
    }
    public void removeAtFirst(){
        head = head.next;
        size--;
    }
    public void removeAtLaast(){
        Node temp = head;
        int i = 0;
        while(i<size){
            temp.next = temp;
            i++;
        }
        temp.next = null;
        temp = tail;
        size--;
    }
    
    public int search(int search){
        Node temp = head;
        if(search == temp.data){
            return 0;
        }
        int index = 0;
        while(temp!=null){
           if(temp.data == search){
            return index;
           }
           index++;
        }
        if(index == 0){
            System.out.println("Element not found...");
        }
        return index;
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
       //     ll.addAtLast(7);
     //       ll.inserAtMiddle(10,4);
     //       ll.removeAtFirst();
            System.out.println(ll.search(6));
            ll.print();
            System.out.println();
         //   System.out.println(ll.size);
            sc.close();
        }
}
