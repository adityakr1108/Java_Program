import java.util.*;
class graphImpletation{
    static class Edge{
        int weight;
        int src; 
        int dest;
        Edge(int src, int weight, int dest){
            this.src = src;
            this.weight = weight;
            this.dest = dest;
        }
    }
    public static void bfs(ArrayList<Edge>[] graph){ 
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);
        while(!q.isEmpty()){
            int node = q.remove();
            if(!vis[node]){
                System.out.print(node + " ");
                vis[node] = true;
                for(int i = 0; i < graph[node].size(); i++){
                    Edge e = graph[node].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v]; // at every location there is a null value, but we have to make it empty..and this line create an array of arraylist
        for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 5, 1));
        graph[1].add(new Edge(1, 5, 0));
        graph[1].add(new Edge(1, 1, 2));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 1, 3));
        graph[2].add(new Edge(2, 2, 4));
        graph[3].add(new Edge(3, 3, 1));
        graph[3].add(new Edge(3, 1, 2));
        graph[4].add(new Edge(4, 2, 2));
        
        bfs(graph);
    }
}