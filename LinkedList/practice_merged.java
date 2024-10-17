public class practice_merged{
    public static class Node{
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

    public static void addATFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
    }   

    public static void main(String[] args){
        practice_merged pl = new practice_merged()
        for(int i = 0; i<10;i++){
            head.next = new Node(i);
        }

    }
}

        
    