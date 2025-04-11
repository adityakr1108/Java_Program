import java.util.*;

class cycleDetection {
    public static boolean isCycle(ArrayList<ArrayList<Integer>> graph){
        boolean vis[] = new boolean [graph.size()];
        Arrays.fill(vis,false);
        int n = graph.size();
        for(int i = 0;i<n;i++){
            if(!vis[i]){
                if(dfs(graph,i,-1,vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static  boolean dfs(ArrayList<ArrayList<Integer>> graph,int node, int par, boolean vis[]){
        vis[node] = true;
        for(int a : graph.get(node)){
            if(!vis[a]){
                if(dfs(graph,a,node,vis)){
                    return true;
                }
            }
            else if(a != par){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0;i<8;i++){
            graph.add(new ArrayList<>());
        }
        // Define the edges using a 2D array
        int arr[][] = {
            {0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}, {3, 7}, {4, 7}, {5, 6}
        };
        
        for (int[] arr1 : arr) {
            int a1 = arr1[0];
            int b1 = arr1[1];
            graph.get(a1).add(b1);
            graph.get(b1).add(a1);
        }

        System.out.println(isCycle(graph));
    }
}
