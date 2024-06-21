package org.example.gt2400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2423Test {

    @Test
    void equalFrequency() {
        var t = new T2423();
        assertTrue(t.equalFrequency("abcc"));
    }

    @Test
    void equalFrequency_2() {
        var t = new T2423();
        assertFalse(t.equalFrequency("ddaccb"));
    }

    @Test
    void equalFrequency_3() {
        var t = new T2423();
        assertTrue(t.equalFrequency("aca"));
    }

    @Test
    void equalFrequency_4() {
        var t = new T2423();
        assertFalse(t.equalFrequency("cbccca"));
    }

    @Test
    void equalFrequency_5() {
        var t = new T2423();
        assertFalse(t.equalFrequency("cbccca"));
    }
}