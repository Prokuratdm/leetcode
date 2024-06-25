package org.example.gt3100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T3114Test {

    T3114 t = new T3114();
    @Test
    void findLatestTime() {
        assertEquals("09:59", t.findLatestTime("0?:5?"));
    }

    @Test
    void findLatestTime_1() {
        assertEquals("11:54", t.findLatestTime("1?:?4"));
    }
}