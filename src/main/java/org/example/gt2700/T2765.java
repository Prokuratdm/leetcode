package org.example.gt2700;

public class T2765 {
    public int alternatingSubarray(int[] nums) {
        int lp = 0;
        int rp = 1;
        int diff = 1;
        int n = nums.length;
        int len = -1;
        while (rp < n) {
            if (nums[rp] - nums[rp - 1] != diff) {
                if (nums[rp] - nums[rp - 1] == 1) {
                    lp = rp - 1;
                } else {
                    lp = rp;
                    rp++;
                }
                diff = 1;
                continue;
            }
            len = Math.max(len, rp - lp + 1);
            diff = diff > 0 ? -1 : 1;
            rp++;
        }
        return len;
    }
}
