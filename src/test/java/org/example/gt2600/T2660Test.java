package org.example.gt2600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2660Test {

    T2660 t = new T2660();
    @Test
    void countPoints() {

        assertEquals(75, t.countPoints(new int[]{10,10,10,10,1,1,1}));
    }
}