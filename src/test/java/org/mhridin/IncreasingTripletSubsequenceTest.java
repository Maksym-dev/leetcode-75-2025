package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class IncreasingTripletSubsequenceTest extends TestCase {

    public void testIncreasingTripletCase1() {
        int[] nums = {1,2,3,4,5};

        boolean result = IncreasingTripletSubsequence.increasingTriplet(nums);

        Assert.assertTrue(result);
    }

    public void testIncreasingTripletCase2() {
        int[] nums = {5,4,3,2,1};

        boolean result = IncreasingTripletSubsequence.increasingTriplet(nums);

        Assert.assertFalse(result);
    }

    public void testIncreasingTripletCase3() {
        int[] nums = {2,1,5,0,4,6};

        boolean result = IncreasingTripletSubsequence.increasingTriplet(nums);

        Assert.assertTrue(result);
    }
}