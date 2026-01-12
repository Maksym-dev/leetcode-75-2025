package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DeleteNodeInABSTTest extends TestCase {

    public void testDeleteNodeCase1() {
        DeleteNodeInABST.TreeNode root = new DeleteNodeInABST.TreeNode(5,
                new DeleteNodeInABST.TreeNode(3, new DeleteNodeInABST.TreeNode(2), new DeleteNodeInABST.TreeNode(4)),
                new DeleteNodeInABST.TreeNode(6, null, new DeleteNodeInABST.TreeNode(7)));

        DeleteNodeInABST.deleteNode(root, 3);

        Assert.assertEquals(4, root.left.val);
    }

    public void testDeleteNodeCase2() {
        DeleteNodeInABST.TreeNode root = new DeleteNodeInABST.TreeNode(5,
                new DeleteNodeInABST.TreeNode(3, new DeleteNodeInABST.TreeNode(2), new DeleteNodeInABST.TreeNode(4)),
                new DeleteNodeInABST.TreeNode(6, null, new DeleteNodeInABST.TreeNode(7)));

        DeleteNodeInABST.deleteNode(root, 0);

        Assert.assertEquals(5, root.val);
        Assert.assertEquals(3, root.left.val);
        Assert.assertEquals(6, root.right.val);
        Assert.assertEquals(2, root.left.left.val);
        Assert.assertEquals(4, root.left.right.val);
        Assert.assertEquals(7, root.right.right.val);
    }

    public void testDeleteNodeCase3() {
        DeleteNodeInABST.TreeNode root = new DeleteNodeInABST.TreeNode();

        DeleteNodeInABST.deleteNode(root, 0);

        Assert.assertEquals(0, root.val);
    }
}