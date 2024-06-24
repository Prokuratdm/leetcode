package org.example.gt900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T941Test {

    T941 t = new T941();

    @Test
    void validMountainArray() {
        assertFalse(t.validMountainArray(new int[]{2, 1}));
    }

    @Test
    void validMountainArray_2() {
        assertFalse(t.validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }

    @Test
    void validMountainArray_4() {
        assertTrue(t.validMountainArray(new int[]{0, 3, 2, 1}));
    }
}