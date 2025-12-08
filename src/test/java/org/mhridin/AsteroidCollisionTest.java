package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

public class AsteroidCollisionTest extends TestCase {

    public void testAsteroidCollisionCase1() {
        int[] asteroids = {5,10,-5};

        int[] result = AsteroidCollision.asteroidCollision(asteroids);

        Assert.assertEquals("[5, 10]", Arrays.toString(result));
    }

    public void testAsteroidCollisionCase2() {
        int[] asteroids = {8,-8};

        int[] result = AsteroidCollision.asteroidCollision(asteroids);

        Assert.assertEquals("[]", Arrays.toString(result));
    }

    public void testAsteroidCollisionCase3() {
        int[] asteroids = {10,2,-5};

        int[] result = AsteroidCollision.asteroidCollision(asteroids);

        Assert.assertEquals("[10]", Arrays.toString(result));
    }

    public void testAsteroidCollisionCase4() {
        int[] asteroids = {3,5,-6,2,-1,4};

        int[] result = AsteroidCollision.asteroidCollision(asteroids);

        Assert.assertEquals("[-6, 2, 4]", Arrays.toString(result));
    }
}