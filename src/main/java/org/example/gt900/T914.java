package org.example.gt900;

import java.util.HashMap;

public class T914 {

    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : deck) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        if (!map.values().stream().allMatch(i -> i > 1)) return false;
        int min = map.values().stream().mapToInt(i -> i).min().getAsInt();
        int max = map.values().stream().mapToInt(i -> i).max().getAsInt();
        int gcd = gcdByEuclidsAlgorithm(min, max);

        int finalGcd = gcd;
        if (gcd == 1) return false;
        if (map.values().stream().allMatch(i -> i % finalGcd == 0)) return true;
        gcd = map.values()
                .stream()
                .filter(i -> i % finalGcd != 0)
                .map(integer -> gcdByEuclidsAlgorithm(integer, finalGcd))
                .mapToInt(Integer::intValue).min().getAsInt();
        if (gcd == 1) return false;
        int finalGcd1 = gcd;
        if (map.values().stream().anyMatch(i -> i % finalGcd1 != 0)) return false;
        return true;
    }

    int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
