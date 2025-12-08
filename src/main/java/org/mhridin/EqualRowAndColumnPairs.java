package org.mhridin;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int gridSize = grid.length;
        int equalPairCount = 0;

        // Iterate through each possible row index
        for (int rowIndex = 0; rowIndex < gridSize; ++rowIndex) {
            // Iterate through each possible column index
            for (int colIndex = 0; colIndex < gridSize; ++colIndex) {
                boolean isEqual = true;

                // Compare elements of row[rowIndex] with column[colIndex]
                for (int position = 0; position < gridSize; ++position) {
                    // Check if element at row[rowIndex][position] equals element at column[position][colIndex]
                    if (grid[rowIndex][position] != grid[position][colIndex]) {
                        isEqual = false;
                        break;
                    }
                }

                // Increment count if the row and column are equal
                if (isEqual) {
                    equalPairCount++;
                }
            }
        }

        return equalPairCount;
    }
}
