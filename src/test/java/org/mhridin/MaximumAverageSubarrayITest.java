package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaximumAverageSubarrayITest extends TestCase {

    public void testFindMaxAverageCase1() {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        Assert.assertEquals(12.75000, result, 0.00001);
    }

    public void testFindMaxAverageCase2() {
        int[] nums = {5};
        int k = 1;

        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);

        Assert.assertEquals(5.00000, result, 0.00001);
    }
}