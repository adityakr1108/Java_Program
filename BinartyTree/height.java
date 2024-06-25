

class height{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int lh = countOfNodes(root.left);
        int rh = countOfNodes(root.right);
         return lh+rh + 1;
    }
    public static int  sumOfNodes(Node root){
        if(root == null) return 0;
        int lhSum = sumOfNodes(root.left);
        int rhSum = sumOfNodes(root.right);
        return lhSum+rhSum + root.data;

    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bin = new BinaryTree();
        Node root = bin.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(height(root));
        int count = 0;
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));



    }
}