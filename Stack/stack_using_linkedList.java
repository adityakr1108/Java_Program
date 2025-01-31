package Stack;
public class stack_using_linkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;   
    static boolean isEmpty(){
        return head == null;
    }

    static void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
     }
     public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }
    public static int peek(){
         if(isEmpty()){
             return -1;
         }
         return head.data;
     }
     public static void main(String[] args) {
        stack_using_linkedList sl = new stack_using_linkedList();
        sl.push(3);
        sl.push(4);
        sl.push(5);
        sl.push(6);
        sl.push(7);
        sl.push(8);
        sl.push(9);
        while(!sl.isEmpty()){
            System.out.println(sl.peek());
            sl.pop();
        }  
     }

}
