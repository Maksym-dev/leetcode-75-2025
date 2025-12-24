package org.mhridin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeRightSideView {
    public static List<Integer> rightSideView(TreeNode root) {
        // Initialize result list to store right side view values
        List<Integer> result = new ArrayList<>();

        // Handle empty tree case
        if (root == null) {
            return result;
        }

        // Use BFS with a queue to traverse the tree level by level
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        // Process each level of the tree
        while (!queue.isEmpty()) {
            // The first node in the queue is the rightmost node of current level
            // (because we add right children before left children)
            result.add(queue.peekFirst().val);

            // Process all nodes at the current level
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                // Add right child first to ensure it appears at the front of the queue
                // for the next level
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

                // Add left child after right child
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
            }
        }

        return result;
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
