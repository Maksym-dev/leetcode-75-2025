package org.mhridin;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
    public static long totalCost(int[] costs, int k, int candidates) {
        int totalWorkers = costs.length;
        long totalHiringCost = 0;

        // Special case: if the candidate pools from both ends cover the entire array
        // Simply sort and take the k cheapest workers
        if (candidates * 2 >= totalWorkers) {
            Arrays.sort(costs);
            for (int i = 0; i < k; i++) {
                totalHiringCost += costs[i];
            }
            return totalHiringCost;
        }

        // Min heap to track available candidates
        // Each element is [cost, index] where we sort by cost first, then by index
        PriorityQueue<int[]> candidateHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];  // If costs are equal, prefer lower index
            }
            return a[0] - b[0];  // Otherwise sort by cost
        });

        // Add initial candidates from the front of the array
        for (int i = 0; i < candidates; i++) {
            candidateHeap.offer(new int[] {costs[i], i});
        }

        // Add initial candidates from the back of the array
        for (int i = 0; i < candidates; i++) {
            candidateHeap.offer(new int[] {costs[totalWorkers - i - 1], totalWorkers - i - 1});
        }

        // Pointers to track the next available workers from front and back
        int leftPointer = candidates;
        int rightPointer = totalWorkers - candidates - 1;

        // Hire k workers
        while (k > 0) {
            // Get the cheapest available candidate
            int[] cheapestCandidate = candidateHeap.poll();
            totalHiringCost += cheapestCandidate[0];

            // If all workers have been considered, continue to next iteration
            if (leftPointer > rightPointer) {
                k--;
                continue;
            }

            // Add a new candidate to replace the hired worker
            // If hired worker was from the left pool, add next from left
            if (cheapestCandidate[1] < leftPointer) {
                candidateHeap.offer(new int[] {costs[leftPointer], leftPointer});
                leftPointer++;
            }
            // If hired worker was from the right pool, add next from right
            else {
                candidateHeap.offer(new int[] {costs[rightPointer], rightPointer});
                rightPointer--;
            }

            k--;
        }

        return totalHiringCost;
    }
}
