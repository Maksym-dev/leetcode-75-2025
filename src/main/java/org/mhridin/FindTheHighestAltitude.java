package org.mhridin;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        // Track the maximum altitude reached
        int maxAltitude = 0;

        // Track the current altitude as we traverse
        int currentAltitude = 0;

        // Iterate through each altitude change
        for (int altitudeChange : gain) {
            // Update current altitude by adding the change
            currentAltitude += altitudeChange;

            // Update maximum altitude if current is higher
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
}
