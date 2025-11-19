package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaxConsecutiveOnesIIITest extends TestCase {

    public void testLongestOnesCase1() {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);

        Assert.assertEquals(6, result);
    }

    public void testLongestOnesCase2() {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);

        Assert.assertEquals(10, result);
    }
}