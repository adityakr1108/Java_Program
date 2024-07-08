
import java.util.*;

class merge2Bst{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    public static void inorder(Node root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }

    public static Node mergeTwoBst(Node root1,Node root2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
       int arr[] = new int[list1.size()+list2.size()];
       int k = 0;
        for(int i = 0;i<list1.size();i++){
            arr[k] = list1.get(i);
            k++;
        }
        for(int i = 0;i<list2.size();i++){
            arr[k] = list2.get(i);
            k++;
        }
        Node root3 = null;
        for(int i = 0;i<k;i++){
           root3 =  insert(root3,arr[i]);
        }

        return root3;
        
    }

    public static Node insert(Node root,int data){
        if(root == null){
             return new Node(data);
        }
        if(root.data > data) root.left = insert(root.left,data);
        else if(root.data < data) root.right = insert(root.right,data);
        return root;
    }
    public static void leverOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }

    }
    public static void main(String[] args) {
        int arr1[] = {2,1,4};
        int arr2[]  = {9,3,12};
        Node root1 = null;
        Node root2 = null;
        for(int i = 0;i<arr1.length;i++){
            root1 = insert(root1, arr1[i]);
        }
        for(int i = 0; i<arr2.length;i++){
            root2 = insert(root2,arr2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node merge = mergeTwoBst(root1,root2);  
        // inorder(merge, list);
        leverOrderTraversal(merge);
        // System.out.println(list);
    }
}
