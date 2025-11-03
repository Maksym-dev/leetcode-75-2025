package org.mhridin;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        StringBuilder vowelStr = new StringBuilder();

        // Store all vowels in vowelStr
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelStr.append(s.charAt(i));
            }
        }

        // Reverse read vowels and replace in string
        StringBuilder result = new StringBuilder(s);
        int idx = vowelStr.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                result.setCharAt(i, vowelStr.charAt(idx--));
            }
        }

        return result.toString();
    }

    // Function to check if a character is a vowel
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I'
                || c == 'O' || c == 'U';
    }
}
