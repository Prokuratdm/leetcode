package org.example.gt2000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2047Test {

    @Test
    void countValidWords() {
        var t = new T2047();
        assertEquals(0,t.countValidWords("!this  1-s b8d!"));

    }
}