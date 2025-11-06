package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

public class MoveZeroesTest extends TestCase {

    public void testMoveZeroesCase1() {
        int[] nums = {0,1,0,3,12};

        MoveZeroes.moveZeroes(nums);

        Assert.assertEquals("[1, 3, 12, 0, 0]", Arrays.toString(nums));
    }

    public void testMoveZeroesCase2() {
        int[] nums = {0};

        MoveZeroes.moveZeroes(nums);

        Assert.assertEquals("[0]", Arrays.toString(nums));
    }
}