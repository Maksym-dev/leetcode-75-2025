package org.mhridin;

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        // Base case: if the node is null, depth is 0
        if (root == null) {
            return 0;
        }

        // Recursively calculate the depth of the left subtree
        int leftDepth = maxDepth(root.left);

        // Recursively calculate the depth of the right subtree
        int rightDepth = maxDepth(root.right);

        // The depth of current node is 1 plus the maximum depth of its subtrees
        return 1 + Math.max(leftDepth, rightDepth);
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
