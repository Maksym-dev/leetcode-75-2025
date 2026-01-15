package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest extends TestCase {

    public void testMinReorderCase1() {
        int n = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};

        int result = new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(n, connections);

        Assert.assertEquals(3, result);
    }

    public void testMinReorderCase2() {
        int n = 5;
        int[][] connections = {{1,0},{1,2},{3,2},{3,4}};

        int result = new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(n, connections);

        Assert.assertEquals(2, result);
    }

    public void testMinReorderCase3() {
        int n = 3;
        int[][] connections = {{1,0},{2,0}};

        int result = new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(n, connections);

        Assert.assertEquals(0, result);
    }
}