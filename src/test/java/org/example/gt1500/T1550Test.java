package org.example.gt1500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1550Test {

    T1550 t = new T1550();

    @Test
    void threeConsecutiveOdds() {
        int[] input = {2,6,4,1};
        boolean result = t.threeConsecutiveOdds(input);
        assertFalse(result);
    }

    @Test
    void threeConsecutiveOdds_2() {
        int[] input = {1,2,34,3,4,5,8,23,12,1,1,1};
        boolean result = t.threeConsecutiveOdds(input);
        assertTrue(result);
    }
}