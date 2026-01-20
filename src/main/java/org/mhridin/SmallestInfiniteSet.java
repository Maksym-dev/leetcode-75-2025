package org.mhridin;

import java.util.TreeSet;

public class SmallestInfiniteSet {
    // TreeSet to maintain sorted unique integers in ascending order
    private TreeSet<Integer> availableNumbers = new TreeSet<>();

    /**
     * Constructor initializes the set with integers from 1 to 1000
     * representing the smallest positive integers in the infinite set
     */
    public SmallestInfiniteSet() {
        // Populate the set with initial values 1 through 1000
        for (int i = 1; i <= 1000; i++) {
            availableNumbers.add(i);
        }
    }

    /**
     * Removes and returns the smallest integer from the infinite set
     * @return the smallest available integer
     */
    public int popSmallest() {
        // Remove and return the first (smallest) element from the TreeSet
        return availableNumbers.pollFirst();
    }

    /**
     * Adds a number back to the infinite set if it's not already present
     * @param num the integer to add back to the set
     */
    public void addBack(int num) {
        // Add the number back to the set (TreeSet handles duplicates automatically)
        availableNumbers.add(num);
    }
}
