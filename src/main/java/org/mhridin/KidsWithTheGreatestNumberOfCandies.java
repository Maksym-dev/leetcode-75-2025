package org.mhridin;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies among all kids
        int maxCandies = 0;
        for (int currentCandies : candies) {
            maxCandies = Math.max(maxCandies, currentCandies);
        }

        // Create result list to store whether each kid can have the greatest amount
        List<Boolean> result = new ArrayList<>();

        // Check each kid: if their candies plus extra candies >= max, they can have the greatest
        for (int currentCandies : candies) {
            boolean canHaveGreatest = (currentCandies + extraCandies) >= maxCandies;
            result.add(canHaveGreatest);
        }

        return result;
    }
}
