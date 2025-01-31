import java.util.*;

class cycleDetection {
    static class Edge {
        int src, dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void buildGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
     graph[0].add(new Edge(0, 1));
    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));
    graph[1].add(new Edge(1, 3));
    graph[2].add(new Edge(2, 1));
    // graph[2].add(new Edge(2, 3));
    graph[2].add(new Edge(2, 4));
    graph[3].add(new Edge(3, 1));
    // graph[3].add(new Edge(3, 2));
    graph[4].add(new Edge(4, 2));
    }

    public static boolean cycleDetection(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) { 
                if (cycleDetectionUtil(graph, vis, i, -1)) { // If a cycle is found, return true
                    return true;
                }
            }
        }
        return false; // No cycle found in any component
    }

    public static boolean cycleDetectionUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                if (cycleDetectionUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            } else if (e.dest != par) { // Cycle detected
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v]; // Initialize array of ArrayLists
        buildGraph(graph);
        System.out.println(cycleDetection(graph));
    }
}
