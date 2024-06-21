package org.example.gt2500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2591Test {

    @Test
    void distMoney() {
        T2591 t = new T2591();
        assertEquals(1,t.distMoney(20 ,3));
    }

    @Test
    void distMoney_2() {
        T2591 t = new T2591();
        assertEquals(1,t.distMoney(17 ,2));
    }
}