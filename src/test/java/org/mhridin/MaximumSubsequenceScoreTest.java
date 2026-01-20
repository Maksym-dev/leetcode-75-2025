package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaximumSubsequenceScoreTest extends TestCase {

    public void testMaxScoreCase1() {
        int[] nums1 = {1,3,3,2};
        int[] nums2 = {2,1,3,4};
        int k = 3;

        long result = MaximumSubsequenceScore.maxScore(nums1, nums2, k);

        Assert.assertEquals(12, result);
    }

    public void testMaxScoreCase2() {
        int[] nums1 = {4,2,3,1,1};
        int[] nums2 = {7,5,10,9,6};
        int k = 1;

        long result = MaximumSubsequenceScore.maxScore(nums1, nums2, k);

        Assert.assertEquals(30, result);
    }
}