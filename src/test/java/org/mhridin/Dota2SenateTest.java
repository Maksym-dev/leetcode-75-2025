package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Dota2SenateTest extends TestCase {

    public void testPredictPartyVictoryCase1() {
        String senate = "RD";

        String result = Dota2Senate.predictPartyVictory(senate);

        Assert.assertEquals("Radiant", result);
    }

    public void testPredictPartyVictoryCase2() {
        String senate = "RDD";

        String result = Dota2Senate.predictPartyVictory(senate);

        Assert.assertEquals("Dire", result);
    }
}