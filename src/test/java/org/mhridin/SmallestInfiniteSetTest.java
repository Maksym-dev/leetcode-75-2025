package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SmallestInfiniteSetTest extends TestCase {

    public void testGeneralSmallestInfiniteSetCase1() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
        Assert.assertEquals(1, smallestInfiniteSet.popSmallest()); // return 1, since 1 is the smallest number, and remove it from the set.
        Assert.assertEquals(2, smallestInfiniteSet.popSmallest()); // return 2, and remove it from the set.
        Assert.assertEquals(3, smallestInfiniteSet.popSmallest()); // return 3, and remove it from the set.
        smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
        Assert.assertEquals(1, smallestInfiniteSet.popSmallest()); // return 1, since 1 was added back to the set and
        // is the smallest number, and remove it from the set.
        Assert.assertEquals(4, smallestInfiniteSet.popSmallest()); // return 4, and remove it from the set.
        Assert.assertEquals(5, smallestInfiniteSet.popSmallest()); // return 5, and remove it from the set.
    }
}