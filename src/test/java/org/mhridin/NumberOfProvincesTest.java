package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NumberOfProvincesTest extends TestCase {

    public void testFindCircleNumCase1() {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};

        int result = new NumberOfProvinces().findCircleNum(isConnected);

        Assert.assertEquals(2, result);
    }

    public void testFindCircleNumCase2() {
        int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};

        int result = new NumberOfProvinces().findCircleNum(isConnected);

        Assert.assertEquals(3, result);
    }
}