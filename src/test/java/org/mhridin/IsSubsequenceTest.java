package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class IsSubsequenceTest extends TestCase {

    public void testIsSubsequenceCase1() {
        String s = "abc";
        String t = "ahbgdc";

        boolean result = IsSubsequence.isSubsequence(s, t);

        Assert.assertTrue(result);
    }

    public void testIsSubsequenceCase2() {
        String s = "axc";
        String t = "ahbgdc";

        boolean result = IsSubsequence.isSubsequence(s, t);

        Assert.assertFalse(result);
    }
}