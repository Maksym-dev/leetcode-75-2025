package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FindPivotIndexTest extends TestCase {

    public void testPivotIndexCase1() {
        int[] nums = {1,7,3,6,5,6};

        int result = FindPivotIndex.pivotIndex(nums);

        Assert.assertEquals(3, result);
    }

    public void testPivotIndexCase2() {
        int[] nums = {1,2,3};

        int result = FindPivotIndex.pivotIndex(nums);

        Assert.assertEquals(-1, result);
    }

    public void testPivotIndexCase3() {
        int[] nums = {2,1,-1};

        int result = FindPivotIndex.pivotIndex(nums);

        Assert.assertEquals(0, result);
    }
}