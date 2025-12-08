package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RemovingStarsFromAStringTest extends TestCase {

    public void testRemoveStarsCase1() {
        String s = "leet**cod*e";

        String result = RemovingStarsFromAString.removeStars(s);

        Assert.assertEquals("lecoe", result);
    }

    public void testRemoveStarsCase2() {
        String s = "erase*****";

        String result = RemovingStarsFromAString.removeStars(s);

        Assert.assertEquals("", result);
    }
}