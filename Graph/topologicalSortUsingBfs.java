import java.util.*;

class topologicalSortUsingBfs {
    public static void main(String[] args) throws java.lang.Exception {
        int[][] arr = {
            {1, 3},
            {2, 3},
            {3, 4},
            {3, 5},
            {4, 6},
            {5, 6}
        };

        // Find number of nodes (max node index + 1)
        int n = 0;
        for (int[] edge : arr) {
            n = Math.max(n, Math.max(edge[0], edge[1]));
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[n + 1];
        for (int[] edge : arr) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            inDegree[v]++;
        }

        // Kahn’s algorithm
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) { // assuming nodes start from 1
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> topoOrder = new ArrayList<>();

        while (!q.isEmpty()) {
            int node = q.remove();
            topoOrder.add(node);
            for (int neighbor : graph.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        // Print Topological Sort
        System.out.println("Topological Order:");
        for (int node : topoOrder) {
            System.out.print(node + " ");
        }
    }
}
