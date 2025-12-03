package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class UniqueNumberOfOccurrencesTest extends TestCase {

    public void testUniqueOccurrencesCase1() {
        int[] arr = {1,2,2,1,1,3};

        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);

        Assert.assertTrue(result);
    }

    public void testUniqueOccurrencesCase2() {
        int[] arr = {1,2};

        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);

        Assert.assertFalse(result);
    }

    public void testUniqueOccurrencesCase3() {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);

        Assert.assertTrue(result);
    }
}