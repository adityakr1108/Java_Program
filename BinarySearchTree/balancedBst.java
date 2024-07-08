

class balancedBst{
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
        if(root.data > data ){
            root.left = insert(root.left, data);
        }
        else if(root.data < data){
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node root = createBalancedBst(arr,0,arr.length-1);
        System.out.println(height(root));

        Node root1 = null;
        for(int i = 0;i<arr.length;i++){
            root1 = insert(root1,arr[i]);
        }

        System.out.println(height(root1));


    }
    public static int  height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static Node createBalancedBst(int arr[],int start,int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBalancedBst(arr, start, mid-1);
        root.right = createBalancedBst(arr, mid+1, end);
        return root;
    }
}