package org.example.gt300;

import java.util.ArrayList;
import java.util.HashMap;

public class T350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int j : nums1) {
            map1.put(j, map1.getOrDefault(j, 0) + 1);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int j : nums2) {
            map2.put(j, map2.getOrDefault(j, 0) + 1);
        }

        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                resultMap.put(key, Math.min(map1.get(key), map2.get(key)));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int key : resultMap.keySet()) {
            int count = resultMap.get(key);
            while (count > 0) {
                result.add(key);
                count--;
            }
        }

        return result.stream().mapToInt(r -> r).toArray();
    }
}
