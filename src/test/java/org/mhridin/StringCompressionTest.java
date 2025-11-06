package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class StringCompressionTest extends TestCase {

    public void testCompressCase1() {
        char[] chars = {'a','a','b','b','c','c','c'};

        int result = StringCompression.compress(chars);

        Assert.assertEquals(6, result);
    }

    public void testCompressCase2() {
        char[] chars = {'a'};

        int result = StringCompression.compress(chars);

        Assert.assertEquals(1, result);
    }

    public void testCompressCase3() {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};

        int result = StringCompression.compress(chars);

        Assert.assertEquals(4, result);
    }
}