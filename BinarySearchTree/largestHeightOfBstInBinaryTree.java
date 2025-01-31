import java.util.*;
class largestHeightOfBstInBinaryTree{
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
        boolean isValidBst;
        int  min;
        int max;
        int height;
        public Info(boolean isValid,int min,int max,int height){
            this.isValidBst = isValid;
            this.min = min;
            this.max = max;
            this.height = height;
        }
    }
    public static int maxBst = 0;
    public static Node maxRoot = null;
    public static Info largestHeightBst(Node root){
        if(root == null){
            return new Info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        Info leftInfo = largestHeightBst(root.left);
        Info rightInfo = largestHeightBst(root.right);
        int height = leftInfo.height + rightInfo.height + 1;
        int min  = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max  = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false,min,max,height);
        }
        if(leftInfo.isValidBst && rightInfo.isValidBst){
            maxBst = Math.max(maxBst,height);

            maxRoot = root;
            return new Info(true,min,max,height);
        }
        return new Info(false,min,max,height);

    }

    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            System.out.println("");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        }
    }


    public static void main(String[] args){
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        System.out.println(largestHeightBst(root).height);
        System.out.println(maxBst);
        levelOrderTraversal(maxRoot);
    }
}