package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RecentCounterTest extends TestCase {

    public void testPingCase1() {
        RecentCounter obj = new RecentCounter();

        int param_1 = obj.ping(1);
        int param_2 = obj.ping(100);
        int param_3 = obj.ping(3001);
        int param_4 = obj.ping(3002);

        Assert.assertEquals(1, param_1);
        Assert.assertEquals(2, param_2);
        Assert.assertEquals(3, param_3);
        Assert.assertEquals(3, param_4);
    }
}