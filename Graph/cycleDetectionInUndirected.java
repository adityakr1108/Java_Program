import java.util.*;

class cycleDetectionInUndirected {
    public static void main(String[] args) throws java.lang.Exception {
        int arr[][] = {
            {1, 2}, 
            {2, 3, 4, 5, 6}, 
            {3, 2}, 
            {4, 2, 6}, 
            {6, 4, 5}, 
            {5, 2, 6}
        };

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create graph
        for (int i = 0; i <= 6; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] a : arr) {
            int a1 = a[0];
            for (int i = 1; i < a.length; i++) {
                int b1 = a[i];
                graph.get(a1).add(b1);
                graph.get(b1).add(a1);
            }
        }

        boolean vis[] = new boolean[7];
        Arrays.fill(vis, false);

        boolean check = false;
        for (int i = 1; i <= 6; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, graph, vis)) {
                    check = true;
                    break;
                }
            }
        }

        if (check) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }

    public static boolean dfs(int source, int parent, ArrayList<ArrayList<Integer>> graph, boolean[] vis) {
        vis[source] = true;

        for (int a : graph.get(source)) {
            if (!vis[a]) {
                if (dfs(a, source, graph, vis)) {
                    return true;
                }
            } else if (a != parent) {
                return true;
            }
        }

        return false;
    }
}
