

class avlTree{
    public static class Node{
        int data;
        int height;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.height = 1;
        }
    }
    public static Node root;
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }
    public static void main(String[] args){
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);
        preOrder(root);
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int getBalanceFactor(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left) - height(root.right);
    }
    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(root.data > data ){
            root.left = insert(root.left,data);
        }
        else if(root.data < data){
            root.right = insert(root.right, data);
        }
        else return root;

        root.height = 1 + Math.max(height(root.left),height(root.right));

        int bf = getBalanceFactor(root);
        // left left case
        if(bf > 1 && data < root.left.data ){
            return rightRotate(root);
        }

        // right right case
        if(bf < -1 && data > root.right.data){
            return leftRotate(root);
        }

        // left Right case
        if(bf > 1 && data > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // right Left Case
        if(bf < -1 && data < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;

        
    }

    public static Node leftRotate(Node x){
        Node y = x.right;
        Node t2 = y.left;

        // rotation part;

        y.left = x;
        x.right = t2;

        // update height
        x.height = Math.max(height(x.left),height(x.right))+1;
        y.height = Math.max(height(y.left),height(y.right))+1;
        return y;
    }

    public static Node rightRotate(Node y){
        Node x = y.left;
        Node t1 = x.right;

        x.right = y;
        y.left = t1;

        y.height = Math.max(height(y.left),height(y.right))+1;
        x.height = Math.max(height(x.left),height(x.right))+1;
        return x; 
    }
}