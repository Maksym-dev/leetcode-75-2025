package org.mhridin;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    /**
     * Finds the maximum number of vowels in any substring of length k.
     * Uses sliding window technique to efficiently count vowels.
     *
     * @param s the input string to search
     * @param k the length of the substring window
     * @return the maximum number of vowels found in any substring of length k
     */
    public static int maxVowels(String s, int k) {
        // Count vowels in the initial window of size k
        int currentVowelCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        // Initialize the maximum count with the first window's count
        int maxVowelCount = currentVowelCount;

        // Slide the window through the rest of the string
        for (int i = k; i < s.length(); i++) {
            // Add the new character entering the window
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }

            // Remove the character leaving the window
            if (isVowel(s.charAt(i - k))) {
                currentVowelCount--;
            }

            // Update the maximum count if current window has more vowels
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        return maxVowelCount;
    }

    /**
     * Checks if a character is a vowel (a, e, i, o, u).
     *
     * @param c the character to check
     * @return true if the character is a vowel, false otherwise
     */
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
