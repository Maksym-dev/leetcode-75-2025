package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TotalCostToHireKWorkersTest extends TestCase {

    public void testTotalCostCase1() {
        int[] costs = {17,12,10,2,7,2,11,20,8};
        int k = 3;
        int candidates = 4;

        long result = TotalCostToHireKWorkers.totalCost(costs, k, candidates);

        Assert.assertEquals(11, result);
    }

    public void testTotalCostCase2() {
        int[] costs = {1,2,4,1};
        int k = 3;
        int candidates = 3;

        long result = TotalCostToHireKWorkers.totalCost(costs, k, candidates);

        Assert.assertEquals(4, result);
    }
}