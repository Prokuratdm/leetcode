package org.example.gt600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T605Test {

    @Test
    void canPlaceFlowers() {
        var flowers = new T605();
        assertTrue(flowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));

    }

    @Test
    void canPlaceFlowers_2() {
        var flowers = new T605();
        assertFalse(flowers.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));

    }
}