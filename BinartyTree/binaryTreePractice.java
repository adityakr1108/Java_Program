import java.util.*;
class binaryTreePractice{
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
    static class binaryTree{
         static int idx = -1;
        public static Node buildTree(int arr[]){
            idx ++;
            if(arr[idx] == -1){
                return null;
            }
            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }
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
    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> qb = new LinkedList<>();
        qb.add(root);
        qb.add(null);
        while(!qb.isEmpty()){
            Node curr = qb.remove();
            if(curr == null){
                System.out.println();
                if(qb.isEmpty()){
                    break;
                }
                else{
                    qb.add(null);
                }
            }
            else{
                System.out.println(curr.data + " ");
                if(curr.left != null){
                    qb.add(curr.left);
                }
                if(curr.right != null){
                    qb.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args){
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(node);
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        levelOrderTraversal(root);

    }

    }
