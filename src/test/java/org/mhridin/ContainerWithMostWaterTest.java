package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ContainerWithMostWaterTest extends TestCase {

    public void testMaxAreaCase1() {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = ContainerWithMostWater.maxArea(height);

        Assert.assertEquals(49, result);
    }

    public void testMaxAreaCase2() {
        int[] height = {1,1};

        int result = ContainerWithMostWater.maxArea(height);

        Assert.assertEquals(1, result);
    }
}