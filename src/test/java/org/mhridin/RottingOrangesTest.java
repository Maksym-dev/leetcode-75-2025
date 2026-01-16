package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RottingOrangesTest extends TestCase {

    public void testOrangesRottingCase1() {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};

        int result = RottingOranges.orangesRotting(grid);

        Assert.assertEquals(4, result);
    }

    public void testOrangesRottingCase2() {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};

        int result = RottingOranges.orangesRotting(grid);

        Assert.assertEquals(-1, result);
    }

    public void testOrangesRottingCase3() {
        int[][] grid = {{0,2}};

        int result = RottingOranges.orangesRotting(grid);

        Assert.assertEquals(0, result);
    }
}