package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class KthLargestElementInAnArrayTest extends TestCase {

    public void testFindKthLargestCase1() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        int result = new KthLargestElementInAnArray().findKthLargest(nums, k);

        Assert.assertEquals(5, result);
    }

    public void testFindKthLargestCase2() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        int result = new KthLargestElementInAnArray().findKthLargest(nums, k);

        Assert.assertEquals(4, result);
    }
}