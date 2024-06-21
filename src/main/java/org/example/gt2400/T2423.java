package org.example.gt2400;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class T2423 {
    public boolean equalFrequency(String word) {
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) { continue;}
            else {
                count[i]--;
                if(isValid(count)) return true;
                count[i]++;
            }
        }
        return false;
    }

    private boolean isValid(int[] count){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0) set.add(count[i]);
        }
        return set.size() == 1;
    }
}
