package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DecodeStringTest extends TestCase {

    public void testDecodeStringCase1() {
        String s = "3[a]2[bc]";

        String result = DecodeString.decodeString(s);

        Assert.assertEquals("aaabcbc", result);
    }

    public void testDecodeStringCase2() {
        String s = "3[a2[c]]";

        String result = DecodeString.decodeString(s);

        Assert.assertEquals("accaccacc", result);
    }

    public void testDecodeStringCase3() {
        String s = "2[abc]3[cd]ef";

        String result = DecodeString.decodeString(s);

        Assert.assertEquals("abcabccdcdcdef", result);
    }
}