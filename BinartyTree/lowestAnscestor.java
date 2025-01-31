
import java.util.ArrayList;
import java.util.Objects;

class lowestAnscestor{  // O(N) + O(N) + O(N) = O(3N) => O(N)

    public static class Node{ 
    int data;
    Node left;
    Node right;
    public  Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
}
    }

    public static boolean getPath(Node root,int n,ArrayList<Node> path){ // O(n)
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }

        boolean leftPath = getPath(root.left,n,path);
        boolean rightPath = getPath(root.right,n,path);
        if(leftPath || rightPath){
            return true;
        }
        
        path.remove(path.size()-1);

        return false;
    }
    public static int lc(Node root,int n, int m){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();


        getPath(root,n,path1);
        getPath(root,m,path2);
        int i;
        for(i = 0;i<path1.size() && i < path2.size();i++){
            if(!Objects.equals(path1.get(i), path2.get(i))){
                break;
            }
        }
        return path1.get(i-1).data;
    }
public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);   
    root.left.right = new Node(5); 
    root.right.left = new Node(6);  
    root.right.right = new Node(7); 
    root.left.left.left = new Node(8);
    root.left.left.right = new Node(9);
        int n = 4;
        int m = 5;

    System.out.println(lc(root,n,m));


    
}
}