package org.mhridin;

import java.util.List;

public class KeysAndRooms {
    // Counter to track the number of rooms visited
    private int visitedRoomCount;

    // Boolean array to mark which rooms have been visited
    private boolean[] visited;

    // Adjacency list representation of rooms and their keys
    private List<List<Integer>> roomGraph;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Initialize the room graph with the input
        roomGraph = rooms;

        // Initialize visited array with size equal to number of rooms
        visited = new boolean[roomGraph.size()];

        // Start DFS traversal from room 0 (which is always unlocked)
        dfs(0);

        // Check if all rooms have been visited
        return visitedRoomCount == roomGraph.size();
    }

    /**
     * Performs depth-first search to visit rooms.
     *
     * @param roomIndex The current room index to visit
     */
    private void dfs(int roomIndex) {
        // If room has already been visited, return to avoid cycles
        if (visited[roomIndex]) {
            return;
        }

        // Mark current room as visited
        visited[roomIndex] = true;

        // Increment the count of visited rooms
        ++visitedRoomCount;

        // Visit all rooms for which we have keys from current room
        for (int nextRoom : roomGraph.get(roomIndex)) {
            dfs(nextRoom);
        }
    }
}
