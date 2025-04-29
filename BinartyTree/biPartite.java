
import java.util.*;

class bipartite{
    static class Edge{
        int src, dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public boolean isBarpitite(ArrayList<Edge> [] graph){
        int col[]= new int[graph.length];
        Arrays.fill(col, -1);
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<graph.length;i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0; j<graph.length;j++){
                        Edge e = graph[curr].get(i);
                        if(col[e.dest] == -1){
                            int color = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = color;
                            q.add(e.dest);

                        }
                        else if(col[curr] == col[e.dest]){
                            return false;
                        }
                    }
                    }
                }
            }
            return true;
        }
    public static void buildGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 2));
    }

    public static void main(String[] args) {
        
    }
}