

class mirrorBst{
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
    public static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(root.data > data){
            root.left = insert(root.left,data);
        }
        else if(root.data < data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);
         
         root.left = right;
         root.right = left;
         return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args){
        int arr[] = {8,5,3,6,10,11};
        Node root = null;
        for(int i = 0;i<arr.length;i++){
           root =  insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        mirror(root);
        System.out.println();
        inorder(root);
    }
}