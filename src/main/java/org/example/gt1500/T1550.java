package org.example.gt1500;

import java.util.LinkedList;

public class T1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int j : arr) {
            if (j % 2 == 1) {
                list.add(j);
                if (list.size() == 3) return true;
            } else {
                list.clear();
            }
        }

        return false;
    };
}
