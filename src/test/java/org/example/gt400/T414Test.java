package org.example.gt400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T414Test {

    T414 t = new T414();

    @Test
    void thirdMax() {
        var result = t.thirdMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16});
        assertEquals(14, result);
    }

    @Test
    void thirdMax_1() {
        var result = t.thirdMax(new int[]{1, 2, 2, 2, 2, 2});
        assertEquals(2, result);
    }
}