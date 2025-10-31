package org.mhridin;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        // Iterate through each position in the flowerbed
        for (int i = 0; i < length; ++i) {
            // Check left neighbor (treat out-of-bounds as empty)
            int leftNeighbor = (i == 0) ? 0 : flowerbed[i - 1];

            // Check right neighbor (treat out-of-bounds as empty)
            int rightNeighbor = (i == length - 1) ? 0 : flowerbed[i + 1];

            // If current position and both neighbors are empty, plant a flower
            if (leftNeighbor + flowerbed[i] + rightNeighbor == 0) {
                // Plant flower at current position
                flowerbed[i] = 1;
                // Decrease the count of flowers still needed to plant
                --n;
            }
        }

        // Return true if all required flowers have been planted
        return n <= 0;
    }
}
