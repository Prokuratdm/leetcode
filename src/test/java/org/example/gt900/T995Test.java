package org.example.gt900;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T995Test {
    T995 t = new T995();

    @Test
    void minKBitFlips() {
        int[] nums = new int[]{0, 1};
        var res = t.minKBitFlips(nums, 2);
        assertEquals(-1, res);
    }

    @Test
    void minKBitFlips_1() {
        int[] nums = new int[]{1, 1, 0};
        var res = t.minKBitFlips(nums, 2);
        assertEquals(-1, res);
    }

    @Test
    void minKBitFlips_2() {
        int[] nums = new int[]{0, 0, 0, 1, 0, 1, 1, 0};
        var res = t.minKBitFlips(nums, 3);
        assertEquals(3, res);
    }

    @Test
    void minKBitFlips_5() throws FileNotFoundException {
        File f = new File("src/test/resources/T995_HUGE_Example.txt");
        Scanner sc = new Scanner(f);
        String str = sc.nextLine();
        sc.close();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(str.replaceAll(" ", "").split(",")).forEach(
                num ->
                        list.add(Objects.equals(num, "1") ?1:0)
        );
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        var res = t.minKBitFlips(nums, 21724);
        assertEquals(-1, res);
    }
}