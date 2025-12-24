package org.mhridin;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumLevelSumOfABinaryTree {
    public static int maxLevelSum(TreeNode root) {
        // Queue for BFS traversal
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        // Track the maximum sum found so far
        int maxSum = Integer.MIN_VALUE;

        // Current level number (1-indexed)
        int currentLevel = 0;

        // Level with the maximum sum
        int resultLevel = 0;

        // Process each level of the tree
        while (!queue.isEmpty()) {
            currentLevel++;

            // Calculate sum for current level
            int levelSum = 0;
            int nodesInCurrentLevel = queue.size();

            // Process all nodes at the current level
            for (int i = 0; i < nodesInCurrentLevel; i++) {
                TreeNode currentNode = queue.pollFirst();
                levelSum += currentNode.val;

                // Add left child to queue for next level
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                // Add right child to queue for next level
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            // Update maximum sum and corresponding level if current level has higher sum
            if (levelSum > maxSum) {
                maxSum = levelSum;
                resultLevel = currentLevel;
            }
        }

        return resultLevel;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
