package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaxNumberOfKSumPairsTest extends TestCase {

    public void testMaxOperationsCase1() {
        int[] nums = {1,2,3,4};
        int k = 5;

        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);

        Assert.assertEquals(2, result);
    }

    public void testMaxOperationsCase2() {
        int[] nums = {3,1,3,4,3};
        int k = 6;

        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);

        Assert.assertEquals(1, result);
    }
}