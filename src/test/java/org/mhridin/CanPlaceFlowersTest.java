package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CanPlaceFlowersTest extends TestCase {

    public void testCanPlaceFlowersCase1() {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assert.assertTrue(result);
    }

    public void testCanPlaceFlowersCase2() {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;

        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);

        Assert.assertFalse(result);
    }
}