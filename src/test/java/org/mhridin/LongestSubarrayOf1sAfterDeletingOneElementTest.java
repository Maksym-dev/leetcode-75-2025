package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class LongestSubarrayOf1sAfterDeletingOneElementTest extends TestCase {

    public void testLongestSubarrayCase1() {
        int[] nums = {1,1,0,1};

        int result = LongestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assert.assertEquals(3, result);
    }

    public void testLongestSubarrayCase2() {
        int[] nums = {0,1,1,1,0,1,1,0,1};

        int result = LongestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assert.assertEquals(5, result);
    }

    public void testLongestSubarrayCase3() {
        int[] nums = {1,1,1};

        int result = LongestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assert.assertEquals(2, result);
    }
}