package org.example.gt2200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2285Test {

    T2285 t = new T2285();

    @Test
    void maximumImportance() {
        long result = t.maximumImportance(5, new int[][]{{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}});
        assertEquals(43, result);
    }

    @Test
    void maximumImportance_1() {
        long result = t.maximumImportance(5, new int[][]{{0,3},{2,4},{1,3}});
        assertEquals(20, result);
    }
}