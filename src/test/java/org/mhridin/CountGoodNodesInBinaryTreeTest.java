package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CountGoodNodesInBinaryTreeTest extends TestCase {

    public void testGoodNodesCase1() {
        CountGoodNodesInBinaryTree.TreeNode root = new CountGoodNodesInBinaryTree.TreeNode(3,
                new CountGoodNodesInBinaryTree.TreeNode(1, new CountGoodNodesInBinaryTree.TreeNode(3), null),
        new CountGoodNodesInBinaryTree.TreeNode(4, new CountGoodNodesInBinaryTree.TreeNode(1), new CountGoodNodesInBinaryTree.TreeNode(5)));

        int result = new CountGoodNodesInBinaryTree().goodNodes(root);

        Assert.assertEquals(4, result);
    }

    public void testGoodNodesCase2() {
        CountGoodNodesInBinaryTree.TreeNode root = new CountGoodNodesInBinaryTree.TreeNode(3,
                new CountGoodNodesInBinaryTree.TreeNode(3, new CountGoodNodesInBinaryTree.TreeNode(4), new CountGoodNodesInBinaryTree.TreeNode(2)), null);

        int result = new CountGoodNodesInBinaryTree().goodNodes(root);

        Assert.assertEquals(3, result);
    }

    public void testGoodNodesCase3() {
        CountGoodNodesInBinaryTree.TreeNode root = new CountGoodNodesInBinaryTree.TreeNode(1);

        int result = new CountGoodNodesInBinaryTree().goodNodes(root);

        Assert.assertEquals(1, result);
    }
}