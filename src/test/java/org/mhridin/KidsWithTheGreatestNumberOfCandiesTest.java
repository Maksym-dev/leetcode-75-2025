package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.List;

public class KidsWithTheGreatestNumberOfCandiesTest extends TestCase {

    public void testKidsWithCandiesCase1() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        Assert.assertEquals("[true, true, true, false, true]", result.toString());
    }

    public void testKidsWithCandiesCase2() {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;

        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        Assert.assertEquals("[true, false, false, false, false]", result.toString());
    }

    public void testKidsWithCandiesCase3() {
        int[] candies = {12,1,12};
        int extraCandies = 10;

        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        Assert.assertEquals("[true, false, true]", result.toString());
    }
}