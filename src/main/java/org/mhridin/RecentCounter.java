package org.mhridin;

public class RecentCounter {
    // Array to store timestamps of requests
    private int[] timestamps = new int[10010];
    // Current index pointing to the next position to insert
    private int currentIndex;

    /**
     * Initialize the counter with zero recent requests
     */
    public RecentCounter() {
        currentIndex = 0;
    }

    /**
     * Records a request at the given timestamp and returns the number of requests
     * that have happened in the past 3000 milliseconds (including the new request)
     *
     * @param t The timestamp of the current request in milliseconds
     * @return The number of requests in the time range [t - 3000, t]
     */
    public int ping(int t) {
        // Store the current timestamp at the current index
        timestamps[currentIndex++] = t;

        // Find the first index where timestamp >= (t - 3000)
        int firstValidIndex = binarySearch(t - 3000);

        // Return the count of valid requests (from firstValidIndex to currentIndex-1)
        return currentIndex - firstValidIndex;
    }

    /**
     * Binary search to find the leftmost index where timestamps[index] >= target
     *
     * @param target The target value to search for
     * @return The index of the first element >= target
     */
    private int binarySearch(int target) {
        int left = 0;
        int right = currentIndex;

        // Binary search for the leftmost position where timestamps[mid] >= target
        while (left < right) {
            int mid = (left + right) >> 1;  // Equivalent to (left + right) / 2

            if (timestamps[mid] >= target) {
                // Move right boundary to mid (keep searching left)
                right = mid;
            } else {
                // Move left boundary past mid
                left = mid + 1;
            }
        }

        return left;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
