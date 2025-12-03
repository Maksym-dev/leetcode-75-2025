package org.mhridin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        // Create a map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element in the array
        for (int element : arr) {
            frequencyMap.merge(element, 1, Integer::sum);
        }

        // Check if all occurrence counts are unique
        // by comparing the size of unique occurrence values with total number of elements
        return new HashSet<>(frequencyMap.values()).size() == frequencyMap.size();
    }
}
