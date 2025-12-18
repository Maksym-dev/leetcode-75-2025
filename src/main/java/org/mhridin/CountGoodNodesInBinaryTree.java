package org.mhridin;

public class CountGoodNodesInBinaryTree {
    // Counter for the number of good nodes found
    private int goodNodeCount = 0;

    public int goodNodes(TreeNode root) {
        // Start DFS traversal with initial maximum value set to minimum integer
        depthFirstSearch(root, Integer.MIN_VALUE);
        return goodNodeCount;
    }

    /**
     * Performs depth-first search to count good nodes.
     *
     * @param node The current node being visited
     * @param maxSoFar The maximum value encountered from root to current node's parent
     */
    private void depthFirstSearch(TreeNode node, int maxSoFar) {
        // Base case: if node is null, return
        if (node == null) {
            return;
        }

        // Check if current node is a good node
        if (maxSoFar <= node.val) {
            // Increment good node counter
            goodNodeCount++;
            // Update maximum value for child nodes
            maxSoFar = node.val;
        }

        // Recursively traverse left subtree
        depthFirstSearch(node.left, maxSoFar);
        // Recursively traverse right subtree
        depthFirstSearch(node.right, maxSoFar);
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
