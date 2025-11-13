package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest extends TestCase {

    public void testMaxVowelsCase1() {
        String s = "abciiidef";
        int k = 3;

        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);

        Assert.assertEquals(3, result);
    }

    public void testMaxVowelsCase2() {
        String s = "aeiou";
        int k = 2;

        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);

        Assert.assertEquals(2, result);
    }

    public void testMaxVowelsCase3() {
        String s = "leetcode";
        int k = 3;

        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k);

        Assert.assertEquals(2, result);
    }
}