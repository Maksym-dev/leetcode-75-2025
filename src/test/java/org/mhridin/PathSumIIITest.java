package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PathSumIIITest extends TestCase {

    public void testPathSumCase1() {
        PathSumIII.TreeNode root = new PathSumIII.TreeNode(10,
                new PathSumIII.TreeNode(5,
                        new PathSumIII.TreeNode(3, new PathSumIII.TreeNode(3), new PathSumIII.TreeNode(-2)),
                        new PathSumIII.TreeNode(2, null, new PathSumIII.TreeNode(1))),
        new PathSumIII.TreeNode(-3, null, new PathSumIII.TreeNode(11)));

        int result = new PathSumIII().pathSum(root, 8);

        Assert.assertEquals(3, result);
    }

    public void testPathSumCase2() {
        PathSumIII.TreeNode root = new PathSumIII.TreeNode(5,
                new PathSumIII.TreeNode(4,
                        new PathSumIII.TreeNode(11, new PathSumIII.TreeNode(7), new PathSumIII.TreeNode(2)),
                        null),
                new PathSumIII.TreeNode(8, new PathSumIII.TreeNode(13), new PathSumIII.TreeNode(4, new PathSumIII.TreeNode(5), new PathSumIII.TreeNode(1))));

        int result = new PathSumIII().pathSum(root, 22);

        Assert.assertEquals(3, result);
    }
}