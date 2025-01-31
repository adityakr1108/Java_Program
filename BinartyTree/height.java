

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
// Time complexity O(n^2)
    public static int diametreOfLongest(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ldh = diametreOfLongest(root.left);
        int rdh = diametreOfLongest(root.right);

        return Math.max(lh+rh+1,Math.max(ldh,rdh));
    }

    public static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }


// 2nd approach to solve the diametre and height of bst

// it takes time of O(n)
    public static  Info diam(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diam(root.left);
        Info rightInfo = diam(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht) + 1;
         
         return new Info(diam,ht);
    }

    public static  boolean subtree(Node root1,Node root2){
        if(root1 == root2){
            return true;
        }
        boolean lt = subtree(root1.left,root2);
        boolean rt = subtree(root1.right,root2);
        return lt || rt;
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bin = new BinaryTree();
        Node root = bin.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(height(root));
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));

        System.out.println(diametreOfLongest(root));

        System.out.println(diam(root).diam);
        System.out.println(diam(root).ht);
        System.out.println(subtree(root, root));

        



        



    }
}