package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

public class FindTheDifferenceOfTwoArraysTest extends TestCase {

    public void testFindDifferenceCase1() {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        Assert.assertEquals("[[1, 3], [4, 6]]", result.toString());
    }

    public void testFindDifferenceCase2() {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        List<List<Integer>> result = FindTheDifferenceOfTwoArrays.findDifference(nums1, nums2);

        Assert.assertEquals("[[3], []]", result.toString());
    }
}