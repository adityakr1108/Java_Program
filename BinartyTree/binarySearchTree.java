import java.util.*;

class binarySearchTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        // static int inx= -1;
        public static Node buildTree(int data,Node root){
            if(root == null){
                return new Node(data);
            }
            
            if(root.data > data){
                root.left = buildTree(data,root.left);
            }
            else if(root.data < data){
                root.right = buildTree(data,root.right);
            }
            return root;
    }
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> qb = new LinkedList<>();
        qb.add(root);
        qb.add(null);
        while(!qb.isEmpty()){
            Node temp = qb.remove();
            if(temp == null){
                System.out.println();
                if(qb.isEmpty()){
                    break;
                }
                else{
                    qb.add(null);
                }
            }
            else{
                System.out.print(temp.data + " ");
                if(temp.left != null){
                    qb.add(temp.left);
                }
                if(temp.right != null){
                    qb.add(temp.right);
                }
            }
        }

    }
    // public static void deleteNode(Node root, int data){
    //     if(root == null){
    //         return;
    //     }
    //     if(root.data == data){
    //         if(ro
    //     }
    // }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    // public static int sumOfTree()

    public static void main(String[] args) {
        int arr[] = {8,5,3,1,4,6,10,11,14,15,16,17};
        Node root = null;
        for(int i = 0; i<arr.length;i++){
            root = buildTree(arr[i],root);
        }
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        System.out.print(height(root));
        System.out.println();
        levelOrderTraversal(root);

    }
}