package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaximumDepthOfBinaryTreeTest extends TestCase {

    public void testMaxDepthCase1() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(3,
                new MaximumDepthOfBinaryTree.TreeNode(9), new MaximumDepthOfBinaryTree.TreeNode(20,
                new MaximumDepthOfBinaryTree.TreeNode(15), new MaximumDepthOfBinaryTree.TreeNode(7)));

        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        Assert.assertEquals(3, result);
    }

    public void testMaxDepthCase2() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(1, null, new MaximumDepthOfBinaryTree.TreeNode(2));

        int result = MaximumDepthOfBinaryTree.maxDepth(root);

        Assert.assertEquals(2, result);
    }
}