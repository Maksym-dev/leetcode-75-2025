package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

public class BinaryTreeRightSideViewTest extends TestCase {

    public void testRightSideViewCase1() {
        BinaryTreeRightSideView.TreeNode root = new BinaryTreeRightSideView.TreeNode(1,
                new BinaryTreeRightSideView.TreeNode(2, null, new BinaryTreeRightSideView.TreeNode(5)),
                new BinaryTreeRightSideView.TreeNode(3, null, new BinaryTreeRightSideView.TreeNode(4)));

        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        Assert.assertEquals("[1, 3, 4]", result.toString());
    }

    public void testRightSideViewCase2() {
        BinaryTreeRightSideView.TreeNode root = new BinaryTreeRightSideView.TreeNode(1,
                new BinaryTreeRightSideView.TreeNode(2, new BinaryTreeRightSideView.TreeNode(4, new BinaryTreeRightSideView.TreeNode(5), null), null),
                new BinaryTreeRightSideView.TreeNode(3));

        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        Assert.assertEquals("[1, 3, 4, 5]", result.toString());
    }

    public void testRightSideViewCase3() {
        BinaryTreeRightSideView.TreeNode root = new BinaryTreeRightSideView.TreeNode(1,null, new BinaryTreeRightSideView.TreeNode(3));

        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        Assert.assertEquals("[1, 3]", result.toString());
    }

    public void testRightSideViewCase4() {
        BinaryTreeRightSideView.TreeNode root = new BinaryTreeRightSideView.TreeNode();

        List<Integer> result = BinaryTreeRightSideView.rightSideView(root);

        Assert.assertEquals("[0]", result.toString());
    }
}