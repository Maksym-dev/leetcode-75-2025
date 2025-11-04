package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

public class ProductOfArrayExceptSelfTest extends TestCase {

    public void testProductExceptSelfCase1() {
        int[] nums = {1,2,3,4};

        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);

        Assert.assertEquals("[24, 12, 8, 6]", Arrays.toString(result));
    }

    public void testProductExceptSelfCase2() {
        int[] nums = {-1,1,0,-3,3};

        int[] result = ProductOfArrayExceptSelf.productExceptSelf(nums);

        Assert.assertEquals("[0, 0, 9, 0, 0]", Arrays.toString(result));
    }
}