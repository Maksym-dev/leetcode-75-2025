package org.mhridin;

public class GuessNumberHigherOrLower extends GuessGame {
    /**
     * Finds the picked number using the binary search template.
     * Feasible condition: guess(mid) <= 0 means mid >= picked number.
     * We find the first value where this is true.
     */
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int firstTrueIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) <= 0) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstTrueIndex;
    }
}

class GuessGame {
    int guess(int num) {
        //TODO
        return 0;
    }
}