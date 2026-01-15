package org.mhridin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero {
    // Adjacency list where each node stores pairs of [neighbor, edgeDirection]
    // edgeDirection: 1 means original direction (needs reversal), 0 means already reversed
    private List<int[]>[] adjacencyList;

    public int minReorder(int n, int[][] connections) {
        // Initialize adjacency list for n nodes
        adjacencyList = new List[n];
        Arrays.setAll(adjacencyList, index -> new ArrayList<>());

        // Build bidirectional graph with edge direction markers
        for (int[] connection : connections) {
            int fromNode = connection[0];
            int toNode = connection[1];

            // Original edge: fromNode -> toNode (marked as 1, needs reversal to reach 0)
            adjacencyList[fromNode].add(new int[] {toNode, 1});

            // Reverse edge: toNode -> fromNode (marked as 0, already points toward 0)
            adjacencyList[toNode].add(new int[] {fromNode, 0});
        }

        // Start DFS from node 0 with no parent (-1)
        return dfs(0, -1);
    }

    private int dfs(int currentNode, int parentNode) {
        int reversalCount = 0;

        // Explore all neighbors of current node
        for (int[] edge : adjacencyList[currentNode]) {
            int neighborNode = edge[0];
            int needsReversal = edge[1];

            // Skip the parent node to avoid revisiting
            if (neighborNode != parentNode) {
                // Add reversal cost (0 or 1) and continue DFS on neighbor
                reversalCount += needsReversal + dfs(neighborNode, currentNode);
            }
        }

        return reversalCount;
    }
}
