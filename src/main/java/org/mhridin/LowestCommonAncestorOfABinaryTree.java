package org.mhridin;

public class LowestCommonAncestorOfABinaryTree {
    /**
     * Finds the lowest common ancestor (LCA) of two nodes in a binary tree.
     *
     * @param root The root of the binary tree
     * @param p The first target node
     * @param q The second target node
     * @return The lowest common ancestor of nodes p and q
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if root is null or root is one of the target nodes
        // then root itself is the answer
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search for LCA in the left subtree
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);

        // Recursively search for LCA in the right subtree
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        // If both left and right subtrees return non-null values,
        // it means p and q are found in different subtrees,
        // so the current root is the LCA
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // If only one subtree returns a non-null value,
        // return that value (it could be the LCA or one of the target nodes)
        // If both are null, return null
        return leftLCA == null ? rightLCA : leftLCA;
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
