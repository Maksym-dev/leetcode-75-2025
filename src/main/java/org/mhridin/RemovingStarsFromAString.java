package org.mhridin;

public class RemovingStarsFromAString {
    public static String removeStars(String s) {
        // Use StringBuilder to efficiently build the result string
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // Check if current character is a star
            if (s.charAt(i) == '*') {
                // Remove the last character from result (the star removes the previous character)
                result.deleteCharAt(result.length() - 1);
            } else {
                // Append non-star character to the result
                result.append(s.charAt(i));
            }
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }
}
