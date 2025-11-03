package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ReverseVowelsOfAStringTest extends TestCase {

    public void testReverseVowelsCase1() {
        String s = "IceCreAm";

        String result = ReverseVowelsOfAString.reverseVowels(s);

        Assert.assertEquals("AceCreIm", result);
    }

    public void testReverseVowelsCase2() {
        String s = "leetcode";

        String result = ReverseVowelsOfAString.reverseVowels(s);

        Assert.assertEquals("leotcede", result);
    }
}