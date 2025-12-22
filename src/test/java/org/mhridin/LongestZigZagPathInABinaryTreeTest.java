package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LongestZigZagPathInABinaryTreeTest extends TestCase {

    public void testLongestZigZagCase1() {
        LongestZigZagPathInABinaryTree.TreeNode root = new LongestZigZagPathInABinaryTree.TreeNode(1, null,
                new LongestZigZagPathInABinaryTree.TreeNode(1, new LongestZigZagPathInABinaryTree.TreeNode(1),
                        new LongestZigZagPathInABinaryTree.TreeNode(1,
                                new LongestZigZagPathInABinaryTree.TreeNode(1, null,
                                        new LongestZigZagPathInABinaryTree.TreeNode(1, null, new LongestZigZagPathInABinaryTree.TreeNode(1))),
                                new LongestZigZagPathInABinaryTree.TreeNode(1))));

        int result = new LongestZigZagPathInABinaryTree().longestZigZag(root);

        Assert.assertEquals(3, result);
    }

    public void testLongestZigZagCase2() {
        LongestZigZagPathInABinaryTree.TreeNode root = new LongestZigZagPathInABinaryTree.TreeNode(1,
                new LongestZigZagPathInABinaryTree.TreeNode(1, null,
                new LongestZigZagPathInABinaryTree.TreeNode(1, new LongestZigZagPathInABinaryTree.TreeNode(1, null,
                        new LongestZigZagPathInABinaryTree.TreeNode(1)), new LongestZigZagPathInABinaryTree.TreeNode(1))),
                new LongestZigZagPathInABinaryTree.TreeNode(1));

        int result = new LongestZigZagPathInABinaryTree().longestZigZag(root);

        Assert.assertEquals(4, result);
    }

    public void testLongestZigZagCase3() {
        LongestZigZagPathInABinaryTree.TreeNode root = new LongestZigZagPathInABinaryTree.TreeNode(1);

        int result = new LongestZigZagPathInABinaryTree().longestZigZag(root);

        Assert.assertEquals(0, result);
    }
}