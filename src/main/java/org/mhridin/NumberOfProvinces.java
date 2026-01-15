package org.mhridin;

public class NumberOfProvinces {
    // Graph adjacency matrix representing connections
    private int[][] graph;
    // Visited array to track which nodes have been explored
    private boolean[] visited;

    /**
     * Finds the number of connected components (provinces) in the graph.
     * A province is a group of directly or indirectly connected cities.
     *
     * @param isConnected 2D array where isConnected[i][j] = 1 means city i and j are connected
     * @return The total number of provinces
     */
    public int findCircleNum(int[][] isConnected) {
        // Initialize the graph with the input matrix
        graph = isConnected;
        int n = graph.length;
        visited = new boolean[n];

        int provinceCount = 0;

        // Iterate through each city
        for (int i = 0; i < n; i++) {
            // If the city hasn't been visited, it's part of a new province
            if (!visited[i]) {
                // Explore all cities in this province using DFS
                dfs(i);
                // Increment province count after exploring the entire component
                provinceCount++;
            }
        }

        return provinceCount;
    }

    /**
     * Depth-First Search to explore all cities connected to the current city.
     * Marks all reachable cities as visited.
     *
     * @param currentCity The current city index being explored
     */
    private void dfs(int currentCity) {
        // Mark current city as visited
        visited[currentCity] = true;

        // Check all other cities for connections
        for (int nextCity = 0; nextCity < graph.length; nextCity++) {
            // If the city hasn't been visited and is connected to current city
            if (!visited[nextCity] && graph[currentCity][nextCity] == 1) {
                // Recursively visit the connected city
                dfs(nextCity);
            }
        }
    }
}
