package org.example.gt300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T350Test {
    T350 t = new T350();

    @Test
    void intersect() {
        int[] nums1= new int[]{1,2,2,1};
        int[] nums2= new int[]{1,2,2,1,3};
        int[] intersect = t.intersect(nums1, nums2);
        assertEquals(intersect.length, 4);
    }
}