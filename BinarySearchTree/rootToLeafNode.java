import java.util.*;
class rootToLeafNode{

    private static void print(List<Integer> temp, int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
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
           root.left =  insert(root.left,data);
        }
        else{
           root.right =  insert(root.right,data);
        }
        return root;

}
public static void main(String[] args){
    List<Integer> temp = new ArrayList<>();

    int arr[] = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i = 0; i<arr.length;i++){
        root  = insert(root,arr[i]);
    }
    printPath(root,temp);

}

public static void printPath(Node root, List<Integer> temp){
    if(root == null){
        return;
    }
    temp.add(root.data);

    if(root.left == null && root.right == null){
        for(int i = 0;i<temp.size();i++){
            System.out.print(temp.get(i) + "->");
        }
        System.out.println("N");
    }
    
    printPath(root.left,temp);
    printPath(root.right, temp);
    temp.remove(temp.size()-1);
}
}
