package org.mhridin;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeysAndRoomsTest extends TestCase {

    public void testCanVisitAllRoomsCase1() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(List.of());

        boolean result = new KeysAndRooms().canVisitAllRooms(rooms);

        Assert.assertTrue(result);
    }

    public void testCanVisitAllRoomsCase2() {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1,3));
        rooms.add(Arrays.asList(3,0,1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(0));

        boolean result = new KeysAndRooms().canVisitAllRooms(rooms);

        Assert.assertFalse(result);
    }
}