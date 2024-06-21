package org.example.gt1900;

import java.util.ArrayList;
import java.util.HashSet;

public class T1909 {
    public boolean canBeIncreasing(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        HashSet<Integer> strangePos = new HashSet<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                strangePos.add(i);
                strangePos.add(i + 1);
            }
        }

        if (strangePos.size() > 2) { return false;}
        if (strangePos.isEmpty()) { return true;}
        boolean actualResult = false;
        for (int num : strangePos) {
            int n = list.get(num);
            list.remove(num);
            boolean result = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) >= list.get(i + 1)) {
                    result =  false;
                }
            }
            list.add(num, n);
            actualResult = result || actualResult;
        }
        return actualResult;

    }
}
