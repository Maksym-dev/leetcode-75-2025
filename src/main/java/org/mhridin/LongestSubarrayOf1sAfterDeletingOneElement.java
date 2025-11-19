package org.mhridin;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        int n = nums.length;

        // left[i] stores the count of consecutive 1s ending at index i-1
        int[] left = new int[n + 1];

        // right[i] stores the count of consecutive 1s starting at index i
        int[] right = new int[n + 1];

        // Build the left array: count consecutive 1s from left to right
        for (int i = 1; i <= n; ++i) {
            if (nums[i - 1] == 1) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Build the right array: count consecutive 1s from right to left
        for (int i = n - 1; i >= 0; --i) {
            if (nums[i] == 1) {
                right[i] = right[i + 1] + 1;
            }
        }

        // Find the maximum length by trying to remove each element
        // and joining the consecutive 1s on both sides
        int maxLength = 0;
        for (int i = 0; i < n; ++i) {
            // For each position, calculate the sum of consecutive 1s
            // before position i and after position i
            maxLength = Math.max(maxLength, left[i] + right[i + 1]);
        }

        return maxLength;
    }
}
