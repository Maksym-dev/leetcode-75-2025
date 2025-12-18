package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LeafSimilarTreesTest extends TestCase {

    public void testLeafSimilarCase1() {
        LeafSimilarTrees.TreeNode root1 = new LeafSimilarTrees.TreeNode(3,
                new LeafSimilarTrees.TreeNode(5, new LeafSimilarTrees.TreeNode(6), new LeafSimilarTrees.TreeNode(2, new LeafSimilarTrees.TreeNode(7), new LeafSimilarTrees.TreeNode(4))),
                new LeafSimilarTrees.TreeNode(1, new LeafSimilarTrees.TreeNode(9), new LeafSimilarTrees.TreeNode(8)));

        LeafSimilarTrees.TreeNode root2 = new LeafSimilarTrees.TreeNode(3,
                new LeafSimilarTrees.TreeNode(5, new LeafSimilarTrees.TreeNode(6), new LeafSimilarTrees.TreeNode(7)),
                new LeafSimilarTrees.TreeNode(1, new LeafSimilarTrees.TreeNode(4), new LeafSimilarTrees.TreeNode(2, new LeafSimilarTrees.TreeNode(9), new LeafSimilarTrees.TreeNode(8))));

        boolean result = LeafSimilarTrees.leafSimilar(root1, root2);

        Assert.assertTrue(result);
    }

    public void testLeafSimilarCase2() {
        LeafSimilarTrees.TreeNode root1 = new LeafSimilarTrees.TreeNode(1, new LeafSimilarTrees.TreeNode(2), new LeafSimilarTrees.TreeNode(3));

        LeafSimilarTrees.TreeNode root2 = new LeafSimilarTrees.TreeNode(1, new LeafSimilarTrees.TreeNode(3), new LeafSimilarTrees.TreeNode(2));

        boolean result = LeafSimilarTrees.leafSimilar(root1, root2);

        Assert.assertFalse(result);
    }
}