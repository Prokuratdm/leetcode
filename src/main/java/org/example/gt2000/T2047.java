package org.example.gt2000;

import java.util.Arrays;
import java.util.HashSet;

public class T2047 {
    public int countValidWords(String sentence) {
        String[] words = sentence.split(" ");
        return (int) Arrays.stream(words).filter(s -> isValid(s)).count();
    }

    public boolean isValid(String token) {
        int hyphenCount = 0;
        int punctuationCount = 0;
        if (token == null || token.length() == 0) {return false;}
        for (int i = 0; i < token.length(); i++) {
            char c = token.charAt(i);

            if (Character.isDigit(c)) {
                return false;
            }

            if (c == '-') {
                hyphenCount++;

                if (hyphenCount > 1 || i == 0 || i == token.length() - 1 || !Character.isLowerCase(token.charAt(i - 1)) || !Character.isLowerCase(token.charAt(i + 1))) {
                    return false;
                }
            }

            if (c == '!' || c == '.' || c == ',') {
                punctuationCount++;

                if (punctuationCount > 1 || i != token.length() - 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
