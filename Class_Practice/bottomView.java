import java.util.*;
class bottomView{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Info{
        int ht;
        Node node;
        
        public Info(int ht,Node node){
            this.ht =  ht;
            this.node = node;
        }
    } 

    public static void bottomViewOfBinary(Node root){
        Queue<Info> q= new LinkedList<>();
        q.add(new Info(0,root));
        q.add(null);
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0;
        int max = 0;
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                map.put(curr.ht,curr.node);

        if(curr.node.left != null){
            q.add(new Info(curr.ht-1,curr.node.left));
            min = Math.min(curr.ht-1,min);
        }
        if(curr.node.right != null){
            q.add(new Info(curr.ht+1,curr.node.right));
            max = Math.max(curr.ht+1,max);
        }
    }
}

        for(int i = min;i<=max;i++){
            System.out.print(map.get(i).data + " ");
        }


    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new  Node(7);

        bottomViewOfBinary(root);
    }
}