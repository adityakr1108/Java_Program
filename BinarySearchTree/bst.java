



class bst{
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
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insert(root.left,data);
        }
        else{
            root.right = insert(root.right,data);
        }
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
    public static void decresing(Node root){
        if(root == null){
            return;
        }
        decresing(root.right);
        System.out.print(root.data + " ");
        decresing(root.left);
    }
    public static boolean search(Node root,int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(root.data > data){
            return search(root.left,data);
        }
        else{
           return  search(root.right,data);
        }
    }

    public static Node delete(Node root, int data){

        if(root.data < data){
            root.right = delete(root.right,data);
        }
        else if (root.data > data){
            root.left = delete(root.left,data);
        }
        else{
        // for no child
        if(root.left == null && root.right == null){
            return null;
        }
         // for one child

         if(root.left == null){
            return root.right;
         }
         else if(root.right == null){
            return root.left;
         }
            // for two child
            Node succ = findInorderSuccessor(root.right);
            root.data = succ.data;
            root.right = delete(root.right,succ.data);
            }
            return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,4,6};
        Node root = null;

        for(int i = 0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        decresing(root);
        System.out.println();
        System.out.print(search(root, 10));
        System.out.println();
        delete(root, 5);
        inorder(root);

    }
}