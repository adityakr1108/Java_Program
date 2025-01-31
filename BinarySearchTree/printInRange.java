// Problem: Print all the elements in the range of low and high in a binary search tree

class printInRange{
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

    public static Node insert(Node root, int data){
        if(root == null){
            Node newNode = new Node(data);
            return newNode;
        }
        if(root.data > data){
            root.left = insert(root.left,data);
        }
        else if(root.data < data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static Node printInRange(Node root,int low, int high){
        if(root == null){
            return null;
        }
        // case 1 : if(root.data > low && root.data < high) 

        if(root.data > low && root.data < high){
            printInRange(root.left,low,high);
            System.out.print(root.data + " ");
            printInRange(root.right,low,high);
        }

        // case 2: if(root.data < low)

        if(root.data < low){
            printInRange(root.right,low,high);
            System.out.print(root.data + " ");
        }

        // case 3: if(root.data > high)

        if(root.data > high){
            printInRange(root.right,low,high);
            System.out.print(root.data + " ");
        }

        return root;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,7,8,9};
        Node root = null;
        for(int i = 0;i<arr.length;i++){
            root = insert(root,arr[i]); 
        }
        printInRange(root,3,8);
    }
}