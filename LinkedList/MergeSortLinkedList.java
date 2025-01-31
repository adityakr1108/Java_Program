public class MergeSortLinkedList {
public static  class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static Node head;
public static int size;
public static Node tail;
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

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // midNode
        Node mid = midNode(head);

        // Right half
        Node rightHalf = mid.next;
        mid.next = null;
        // Left half
        Node NewLeftHalf = mergeSort(head);
        Node NewRightHalf = mergeSort(rightHalf);

        // return merge
        return merge(NewLeftHalf,NewRightHalf);
    
    }

    public Node midNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node merge(Node NewLeftHalf,Node NewRightHalf){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(NewLeftHalf != null && NewRightHalf != null){
            if(NewLeftHalf.data <= NewRightHalf.data){
                temp.next = NewLeftHalf;
                NewLeftHalf = NewLeftHalf.next;
            }
            else{
                temp.next = NewRightHalf;
                NewRightHalf = NewRightHalf.next;
            }
            temp = temp.next;
        }

        while(NewLeftHalf!= null){
            temp = NewLeftHalf;
            NewLeftHalf = NewLeftHalf.next;
            temp = temp.next;
        }
        while(NewRightHalf != null){
            temp = NewRightHalf;
            NewRightHalf = NewRightHalf.next;
            temp = temp.next;
        }

        return mergedLL.next;


    }
    public static void main(String[] args) {
        MergeSortLinkedList ml = new MergeSortLinkedList();
        ml.addAtFirst(1);
        ml.addAtFirst(2);
        ml.addAtFirst(3);
        ml.addAtFirst(4);
        ml.addAtFirst(5);
        ml.addAtFirst(6);
        ml.addAtFirst(7);
        ml.print();
        ml.head = ml.mergeSort(ml.head);
         ml.print();
    
    }
}
