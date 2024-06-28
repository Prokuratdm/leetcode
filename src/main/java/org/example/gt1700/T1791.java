package org.example.gt1700;

import java.util.HashMap;

public class T1791 {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] edge : edges) {
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
        }
        int maxVal=1;
        int maxKey = Integer.MIN_VALUE;
        for (Integer key : map.keySet()) {
            if (map.get(key) > maxVal) {
                maxVal = map.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }
}
