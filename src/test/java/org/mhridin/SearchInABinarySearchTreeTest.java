package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SearchInABinarySearchTreeTest extends TestCase {

    public void testSearchBSTCase1() {
        SearchInABinarySearchTree.TreeNode root = new SearchInABinarySearchTree.TreeNode(4, new SearchInABinarySearchTree.TreeNode(2,
                new SearchInABinarySearchTree.TreeNode(1), new SearchInABinarySearchTree.TreeNode(3)), new SearchInABinarySearchTree.TreeNode(7));

        SearchInABinarySearchTree.TreeNode result = SearchInABinarySearchTree.searchBST(root, 2);

        Assert.assertEquals(2, result.val);
    }

    public void testSearchBSTCase2() {
        SearchInABinarySearchTree.TreeNode root = new SearchInABinarySearchTree.TreeNode(4, new SearchInABinarySearchTree.TreeNode(2,
                new SearchInABinarySearchTree.TreeNode(1), new SearchInABinarySearchTree.TreeNode(3)), new SearchInABinarySearchTree.TreeNode(7));

        SearchInABinarySearchTree.TreeNode result = SearchInABinarySearchTree.searchBST(root, 5);

        Assert.assertNull(result);
    }
}