package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaximumLevelSumOfABinaryTreeTest extends TestCase {

    public void testMaxLevelSumCase1() {
        MaximumLevelSumOfABinaryTree.TreeNode root = new MaximumLevelSumOfABinaryTree.TreeNode(1,
                new MaximumLevelSumOfABinaryTree.TreeNode(7,
                        new MaximumLevelSumOfABinaryTree.TreeNode(7),
                        new MaximumLevelSumOfABinaryTree.TreeNode(-8)),
                new MaximumLevelSumOfABinaryTree.TreeNode(0));

        int result = MaximumLevelSumOfABinaryTree.maxLevelSum(root);

        Assert.assertEquals(2, result);
    }

    public void testMaxLevelSumCase2() {
        MaximumLevelSumOfABinaryTree.TreeNode root = new MaximumLevelSumOfABinaryTree.TreeNode(989,null,
                new MaximumLevelSumOfABinaryTree.TreeNode(10250,
                        new MaximumLevelSumOfABinaryTree.TreeNode(98693),
                        new MaximumLevelSumOfABinaryTree.TreeNode(-89388, null, new MaximumLevelSumOfABinaryTree.TreeNode(-32127))));

        int result = MaximumLevelSumOfABinaryTree.maxLevelSum(root);

        Assert.assertEquals(2, result);
    }
}