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

    void deleteAtNthNode(int n){
        Node temp = head;
        int sz = 0;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i = 0;
        int iToFind = sz-i;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return; 
        
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void palindrome(){
        Node mid = findMid(head);
        Node prevPoi = null;
        Node currPoi = mid;
        Node nextPoi;
        while(currPoi != null){
            nextPoi = currPoi.next;
            currPoi.next = prevPoi;
            
        }
    }
    public int search(int search){
        Node temp = head;
        int index = 0;
        while(temp!=null){
           if(temp.data == search){
            return index;
           }
           temp = temp.next;
           index++;
        }
        
        return -1;
    }
    public int helper(Node head, int search){
         if(head == null){
            return -1;
         }
         if(head.data == search){
            return 0;
         }
         int idx = helper(head.next,search);
         if(idx == -1){
           return -1;
         }
         return idx+1;
    }
    public int recSearch(int search){
        return helper(head,search);
    }
    public void reverse(){
      if (head == null || head.next == null){
        return;
      }
      Node prev = null;
      Node curr = head;
      Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

    }


    public static boolean checkCycle(){ // floyds' Algorithm to find cycle
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
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
        //ll.addAtLast(7);
        //ll.inserAtMiddle(10,4);
        //ll.removeAtFirst();
        //System.out.println("Enter the elemnt to search...");
        //int search = sc.nextInt();
        //System.out.println("Elemnt found at index..."+ll.search(search));
        //System.out.println(ll.recSearch(search));
        ll.print();
            ll.reverse();
            ll.print();
            System.out.println();
         //   System.out.println(ll.size);
            sc.close();
        }
}
