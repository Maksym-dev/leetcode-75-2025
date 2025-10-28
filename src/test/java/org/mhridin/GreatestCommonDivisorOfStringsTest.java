package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class GreatestCommonDivisorOfStringsTest extends TestCase {

    public void testGcdOfStringsCase1() {
        String str1 = "ABCABC";
        String str2 = "ABC";

        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);

        Assert.assertEquals("ABC", result);
    }

    public void testGcdOfStringsCase2() {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);

        Assert.assertEquals("AB", result);
    }

    public void testGcdOfStringsCase3() {
        String str1 = "LEET";
        String str2 = "CODE";

        String result = GreatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);

        Assert.assertEquals("", result);
    }
}