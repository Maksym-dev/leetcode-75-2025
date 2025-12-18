package org.mhridin;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Collect leaf values from the first tree
        List<Integer> leafValues1 = new ArrayList<>();
        // Collect leaf values from the second tree
        List<Integer> leafValues2 = new ArrayList<>();

        // Perform depth-first search to collect leaves from both trees
        collectLeaves(root1, leafValues1);
        collectLeaves(root2, leafValues2);

        // Compare the two leaf value sequences
        return leafValues1.equals(leafValues2);
    }

    /**
     * Performs a depth-first search to collect all leaf node values in order.
     *
     * @param node The current node being processed
     * @param leafValues The list to store leaf values
     */
    private static void collectLeaves(TreeNode node, List<Integer> leafValues) {
        // Check if current node is a leaf node
        // Note: node.left == node.right only when both are null
        if (node.left == null && node.right == null) {
            leafValues.add(node.val);
            return;
        }

        // Recursively traverse the left subtree
        if (node.left != null) {
            collectLeaves(node.left, leafValues);
        }

        // Recursively traverse the right subtree
        if (node.right != null) {
            collectLeaves(node.right, leafValues);
        }
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
