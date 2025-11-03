package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ReverseWordsInAStringTest extends TestCase {

    public void testReverseWordsCase1() {
        String s = "the sky is blue";

        String result = ReverseWordsInAString.reverseWords(s);

        Assert.assertEquals("blue is sky the", result);
    }

    public void testReverseWordsCase2() {
        String s = "  hello world  ";

        String result = ReverseWordsInAString.reverseWords(s);

        Assert.assertEquals("world hello", result);
    }

    public void testReverseWordsCase3() {
        String s = "a good   example";

        String result = ReverseWordsInAString.reverseWords(s);

        Assert.assertEquals("example good a", result);
    }
}