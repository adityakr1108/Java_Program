import java.util.*;
class topologicalSortUsingDfs{
    static Deque<Integer> dq;
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3},
            {2, 3},
            {3, 4},
            {3, 5},
            {4, 6},
            {5, 6}
        };
        dq = new LinkedList<>();


        List<List<Integer>> graph = new ArrayList<>();

        for(int []  edge : arr){
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
        }


        boolean vis[] = new boolean [graph.size()];

        for(int i = 0;i<vis.length;i++){
            dfs(i,graph,vis);
        }


    }

    public static void dfs(int node, List<List<Integer>> graph, boolean vis[]){
        vis[node] = true;
        for(int n = node;n<graph.get(node).size();n++){
            if(!vis[n]){
                dfs(n,graph,vis);
                dq.addFirst(n);

            }
        }
    }
}