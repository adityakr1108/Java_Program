class validateBst{
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
            return new Node(data);
        }
        if(root.data > data){
            root.left = insert(root.left,data);
        }
        else{
            root.right = insert(root.right,data);
        }
        return root;
    }


       
    public static boolean isValidBST(Node root,Node min, Node max){
        if(root == null){
            return true;
        }
        else if(min != null && root.data <= min.data || max != null && root.data >= max.data){
            return false;
        }
       return  isValidBST(root.left,min,root) && isValidBST(root.right, root,max);
    }

    public static void main(String[] args){
        int arr[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i = 0; i<arr.length;i++){
            root  = insert(root,arr[i]);
        }
        System.out.println(isValidBST(root,null,null));
    }
}