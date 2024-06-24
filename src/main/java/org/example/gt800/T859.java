package org.example.gt800;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class T859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if(!haveSameCharacters(s, goal)) return false;
        ArrayList<Integer> wrongI = new ArrayList<>();
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) wrongI.add(i);
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (wrongI.isEmpty()) {
            if(count.values().stream().anyMatch(integer -> integer>=2)) return true;
            return false;
        }
        return wrongI.size() == 2;
    }

    public boolean haveSameCharacters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charFrequency1 = new HashMap<>();
        Map<Character, Integer> charFrequency2 = new HashMap<>();

        // Подсчет частоты символов в первой строке
        for (char c : str1.toCharArray()) {
            charFrequency1.put(c, charFrequency1.getOrDefault(c, 0) + 1);
        }

        // Подсчет частоты символов во второй строке
        for (char c : str2.toCharArray()) {
            charFrequency2.put(c, charFrequency2.getOrDefault(c, 0) + 1);
        }

        // Проверка, что частоты символов в обеих строках равны
        for (char c : charFrequency1.keySet()) {
            if (!charFrequency2.containsKey(c) || !Objects.equals(charFrequency1.get(c), charFrequency2.get(c))) {
                return false;
            }
        }

        return true;
    }
}
