package org.mhridin;

public class KthLargestElementInAnArray {
    private int[] nums;
    private int targetIndex; // Index of kth largest element (from the beginning)

    public int findKthLargest(int[] nums, int k) {
        this.nums = nums;
        // Convert kth largest to (n-k)th smallest for easier processing
        this.targetIndex = nums.length - k;
        return quickSelect(0, nums.length - 1);
    }

    /**
     * QuickSelect algorithm to find the element at targetIndex position
     * @param left - left boundary of current partition
     * @param right - right boundary of current partition
     * @return the element at targetIndex position when array is sorted
     */
    private int quickSelect(int left, int right) {
        // Base case: single element
        if (left == right) {
            return nums[left];
        }

        // Initialize two pointers for partitioning
        int i = left - 1;
        int j = right + 1;

        // Choose middle element as pivot
        int pivot = nums[(left + right) >>> 1];

        // Partition the array around the pivot
        while (i < j) {
            // Move i pointer to the right until we find an element >= pivot
            while (nums[++i] < pivot) {
                // Empty body - increment happens in condition
            }

            // Move j pointer to the left until we find an element <= pivot
            while (nums[--j] > pivot) {
                // Empty body - decrement happens in condition
            }

            // Swap elements if pointers haven't crossed
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // After partitioning, j is the last index of left partition
        // Recursively search in the appropriate partition
        if (j < targetIndex) {
            // Target is in the right partition
            return quickSelect(j + 1, right);
        }
        // Target is in the left partition (including j)
        return quickSelect(left, j);
    }
}
