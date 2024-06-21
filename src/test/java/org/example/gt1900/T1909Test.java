package org.example.gt1900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1909Test {

    @Test
    void canBeIncreasing() {
        T1909 t = new T1909();
        assertTrue(t.canBeIncreasing(new int[]{2, 3,10,5}));
    }

    @Test
    void canBeIncreasing_2() {
        T1909 t = new T1909();
        assertFalse(t.canBeIncreasing(new int[]{2,3,1,2}));
    }
}