#include <iostream>
#include <vector>
#include <stack>
using namespace std;

void dfs(int vertex, vector<vector<int>>& graph, vector<bool>& visited, stack<int>& s) {
    visited[vertex] = true;
    for(auto child : graph[vertex]) {
        if(!visited[child]) {
            dfs(child, graph, visited, s);
        }
    }
    s.push(vertex);
}

int main() {
    int nodes, edges;
    cin >> nodes >> edges;
    vector<vector<int>> graph(nodes + 1);
    vector<bool> visited(nodes + 1, false);
    stack<int> s;

    for(int i = 0; i < edges; i++) {
        int u, v;
        cin >> u >> v; // Assuming edge u -> v
        graph[u].push_back(v);
    }

    // Call dfs for each unvisited node
    for(int i = 1; i <= nodes; i++) {
        if(!visited[i]) {
            dfs(i, graph, visited, s);
        }
    }

    // Print topological sort
    while(!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }

    return 0;
}