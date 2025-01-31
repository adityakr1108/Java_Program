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

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);   
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
          
        bottomView(root);

    }

    static class Info{
        Node node;
        int ht; 
        public Info(Node node,int ht){
            this.node = node;
            this.ht = ht;
        }
    }

    public static void bottomView(Node root){
        Queue<Info> q = new LinkedList<>();

        HashMap<Integer,Node> map = new HashMap<>();
        q.add(new Info(root,0));
        q.add(null);

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
            q.add(new Info(curr.node.left,curr.ht-1));
            min = Math.min(min,curr.ht-1);

        }
        if(curr.node.right != null){
            q.add(new Info(curr.node.right,curr.ht+1));
            max = Math.max(max,curr.ht+1);
        }
        }
    }

    for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        
    }
}
    }

// Expected output: 4 2 1 3 7 9