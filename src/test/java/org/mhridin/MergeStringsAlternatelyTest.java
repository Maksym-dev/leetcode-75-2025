package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class MergeStringsAlternatelyTest extends TestCase {

    public void testMergeAlternatelyCase1() {
        String word1 = "abc";
        String word2 = "pqr";

        String word3 = MergeStringsAlternately.mergeAlternately(word1, word2);

        Assert.assertEquals("apbqcr", word3);
    }

    public void testMergeAlternatelyCase2() {
        String word1 = "ab";
        String word2 = "pqrs";

        String word3 = MergeStringsAlternately.mergeAlternately(word1, word2);

        Assert.assertEquals("apbqrs", word3);
    }

    public void testMergeAlternatelyCase3() {
        String word1 = "abcd";
        String word2 = "pq";

        String word3 = MergeStringsAlternately.mergeAlternately(word1, word2);

        Assert.assertEquals("apbqcd", word3);
    }
}