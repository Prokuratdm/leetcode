package org.example.gt2700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2760Test {

    @Test
    void longestAlternatingSubarray() {
        var t = new T2760();
        int res = t.longestAlternatingSubarray(new int[]{3,2,5,4}, 5);
        assertEquals(3, res);
    }

    @Test
    void longestAlternatingSubarray_2() {
        var t = new T2760();
        int res = t.longestAlternatingSubarray(new int[]{1,2}, 2);
        assertEquals(1, res);
    }

    @Test
    void longestAlternatingSubarray_3() {
        var t = new T2760();
        int res = t.longestAlternatingSubarray(new int[]{2,3,4,5}, 4);
        assertEquals(3, res);
    }
}