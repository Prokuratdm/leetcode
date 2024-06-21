package org.example.gt2900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2996Test {

    @Test
    void missingInteger() {
        var t = new T2996();
        var res = t.missingInteger(new int[]{1,2,3,2,5});

        assertEquals(6,res);
    }

    @Test
    void missingInteger_2() {
        var t = new T2996();
        var res = t.missingInteger(new int[]{37,1,2,9,5,8,5,2,9,4});

        assertEquals(38,res);
    }
}