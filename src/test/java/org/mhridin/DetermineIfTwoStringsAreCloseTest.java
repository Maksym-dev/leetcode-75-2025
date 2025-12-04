package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DetermineIfTwoStringsAreCloseTest extends TestCase {

    public void testCloseStringsCase1() {
        String word1 = "abc";
        String word2 = "bca";

        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);

        Assert.assertTrue(result);
    }

    public void testCloseStringsCase2() {
        String word1 = "a";
        String word2 = "aa";

        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);

        Assert.assertFalse(result);
    }

    public void testCloseStringsCase3() {
        String word1 = "cabbba";
        String word2 = "abbccc";

        boolean result = DetermineIfTwoStringsAreClose.closeStrings(word1, word2);

        Assert.assertTrue(result);
    }
}