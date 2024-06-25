package org.example.gt400;

import java.util.ArrayList;
import java.util.HashSet;

public class T414 {

    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : set) {
            list.add(num);
            list.sort((o1, o2) -> Integer.compare(o2, o1));
            if (list.size() > 3) {
                list.remove(3);
            }
        }

        return (int) list.size() < 3 ? list.get(0) : list.get(2);
    }
}
