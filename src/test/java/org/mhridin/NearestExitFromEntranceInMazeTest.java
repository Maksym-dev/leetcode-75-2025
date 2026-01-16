package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NearestExitFromEntranceInMazeTest extends TestCase {

    public void testNearestExitCase1() {
        char[][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int[] entrance = {1,2};

        int result = NearestExitFromEntranceInMaze.nearestExit(maze, entrance);

        Assert.assertEquals(1, result);
    }

    public void testNearestExitCase2() {
        char[][] maze = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
        int[] entrance = {1,0};

        int result = NearestExitFromEntranceInMaze.nearestExit(maze, entrance);

        Assert.assertEquals(2, result);
    }

    public void testNearestExitCase3() {
        char[][] maze = {{'.','+'}};
        int[] entrance = {0,0};

        int result = NearestExitFromEntranceInMaze.nearestExit(maze, entrance);

        Assert.assertEquals(-1, result);
    }
}