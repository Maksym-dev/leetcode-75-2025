package org.mhridin;

public class SearchInABinarySearchTree {
    public static TreeNode searchBST(TreeNode root, int val) {
        // Base case: if root is null or we found the target value
        if (root == null || root.val == val) {
            return root;
        }

        // BST property: if target value is less than current node value, search left subtree
        // Otherwise, search right subtree
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
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
