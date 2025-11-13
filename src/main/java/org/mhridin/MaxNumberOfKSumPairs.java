package org.mhridin;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        // Sort the array to enable two-pointer approach
        Arrays.sort(nums);

        // Initialize two pointers: left at start, right at end
        int left = 0;
        int right = nums.length - 1;

        // Counter for number of valid operations
        int operationCount = 0;

        // Use two pointers to find pairs that sum to k
        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == k) {
                // Found a valid pair, increment count and move both pointers
                operationCount++;
                left++;
                right--;
            } else if (currentSum > k) {
                // Sum is too large, move right pointer to decrease sum
                right--;
            } else {
                // Sum is too small, move left pointer to increase sum
                left++;
            }
        }

        return operationCount;
    }
}
