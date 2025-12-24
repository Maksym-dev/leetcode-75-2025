package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LowestCommonAncestorOfABinaryTreeTest extends TestCase {

    public void testLowestCommonAncestorCase1() {
        LowestCommonAncestorOfABinaryTree.TreeNode left = new LowestCommonAncestorOfABinaryTree.TreeNode(5,
                new LowestCommonAncestorOfABinaryTree.TreeNode(6),
                new LowestCommonAncestorOfABinaryTree.TreeNode(2, new LowestCommonAncestorOfABinaryTree.TreeNode(7), new LowestCommonAncestorOfABinaryTree.TreeNode(4)));
        LowestCommonAncestorOfABinaryTree.TreeNode right = new LowestCommonAncestorOfABinaryTree.TreeNode(1, new LowestCommonAncestorOfABinaryTree.TreeNode(0), new LowestCommonAncestorOfABinaryTree.TreeNode(8));
        LowestCommonAncestorOfABinaryTree.TreeNode root = new LowestCommonAncestorOfABinaryTree.TreeNode(3,
                left,
                right);

        LowestCommonAncestorOfABinaryTree.TreeNode result = LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, left, right);

        Assert.assertEquals(3, result.val);
    }

    public void testLowestCommonAncestorCase2() {
        LowestCommonAncestorOfABinaryTree.TreeNode right1 = new LowestCommonAncestorOfABinaryTree.TreeNode(4);
        LowestCommonAncestorOfABinaryTree.TreeNode left = new LowestCommonAncestorOfABinaryTree.TreeNode(5,
                new LowestCommonAncestorOfABinaryTree.TreeNode(6),
                new LowestCommonAncestorOfABinaryTree.TreeNode(2, new LowestCommonAncestorOfABinaryTree.TreeNode(7), right1));
        LowestCommonAncestorOfABinaryTree.TreeNode right = new LowestCommonAncestorOfABinaryTree.TreeNode(1, new LowestCommonAncestorOfABinaryTree.TreeNode(0), new LowestCommonAncestorOfABinaryTree.TreeNode(8));
        LowestCommonAncestorOfABinaryTree.TreeNode root = new LowestCommonAncestorOfABinaryTree.TreeNode(3,
                left,
                right);

        LowestCommonAncestorOfABinaryTree.TreeNode result = LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, left, right1);

        Assert.assertEquals(5, result.val);
    }

    public void testLowestCommonAncestorCase3() {
        LowestCommonAncestorOfABinaryTree.TreeNode left = new LowestCommonAncestorOfABinaryTree.TreeNode(2);
        LowestCommonAncestorOfABinaryTree.TreeNode root = new LowestCommonAncestorOfABinaryTree.TreeNode(1,
                left,
                null);

        LowestCommonAncestorOfABinaryTree.TreeNode result = LowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, root, left);

        Assert.assertEquals(1, result.val);
    }
}