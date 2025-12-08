package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class EqualRowAndColumnPairsTest extends TestCase {

    public void testEqualPairsCase1() {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};

        int result = EqualRowAndColumnPairs.equalPairs(grid);

        Assert.assertEquals(1, result);
    }

    public void testEqualPairsCase2() {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};

        int result = EqualRowAndColumnPairs.equalPairs(grid);

        Assert.assertEquals(3, result);
    }
}