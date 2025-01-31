import java.util.*;
class graphPractice{
    static class edge{
        int src;
        int weight;
        int dest;
        edge(int src, int weight, int dest){
            this.src = src;
            this.weight = weight;
            this.dest = dest;
        }   
    }
    public static void buildGraph(){
        ArrayList<edge> [] graph = new ArrayList[5];
        for(int i = 0;i<5;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 5, 1));
        graph[1].add(new edge(1, 5, 0));
        graph[1].add(new edge(1, 1, 2));
        graph[1].add(new edge(1, 3, 3));
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 1, 3));
        graph[2].add(new edge(2, 2, 4));
        graph[3].add(new edge(3, 3, 1));
        graph[3].add(new edge(3, 1, 2));
        graph[4].add(new edge(4, 2, 2));

        dfs(graph);
        System.out.println();
        bfs(graph);

    }
    public static void bfs(ArrayList<edge>[] graph){
        boolean vis[] = new boolean[5];
        for(int i = 0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<edge>[] graph, boolean[] vis){ 
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int node = q.remove();
            if(!vis[node]){
                System.out.print(node + " ");
                vis[node] = true;
                for(int i = 0; i<graph[node].size();i++){
                    edge e = graph[node].get(i);
                    q.add(e.dest);
                }
            }
        }

    }
    public static void dfsUtil(ArrayList<edge> [] graph, int curr, boolean []vis){
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }

    public static void dfs(ArrayList<edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfsUtil(graph, i, vis);
                System.out.println(); // Print a new line after each connected component
        }
    }
}

    public static void main(String[] args) {
        buildGraph();
    }
}