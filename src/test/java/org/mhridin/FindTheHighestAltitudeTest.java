package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FindTheHighestAltitudeTest extends TestCase {

    public void testLargestAltitudeCase1() {
        int[] gain = {-5,1,5,0,-7};

        int result = FindTheHighestAltitude.largestAltitude(gain);

        Assert.assertEquals(1, result);
    }

    public void testLargestAltitudeCase2() {
        int[] gain = {-4,-3,-2,-1,4,3,2};

        int result = FindTheHighestAltitude.largestAltitude(gain);

        Assert.assertEquals(0, result);
    }
}