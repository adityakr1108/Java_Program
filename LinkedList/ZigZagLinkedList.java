public class ZigZagLinkedList {
    public class Node{
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
    public void print(){
        Node temp= head;
        while(temp  != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null\n");
        
    }  
    
    public void zigzag(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; 
        Node curr = mid.next;
        mid.next = null;  
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            right = nextR;
            left = nextL;
        }
    }

    public static void main(String[] args) {
        ZigZagLinkedList zz = new ZigZagLinkedList();
        zz.addAtLast(1);
        zz.addAtLast(2);
        zz.addAtLast(3);
        zz.addAtLast(4);
        zz.addAtLast(5);
        zz.addAtLast(6);
        zz.print();
        zz.zigzag();
        zz.print();
    }
}
