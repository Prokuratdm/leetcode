package org.example.gt2700;

public class T2760 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int lp = 0;
        int rp = 0;
        int max = 0;
        while (rp < nums.length) {
            if (nums[lp] % 2 != 0 || nums[lp] > threshold) {
                lp++;
                rp = lp;
                continue;
            }

            max = Math.max(max, rp - lp + 1);
            rp++;
            if (rp == nums.length) {
                break;
            }
            if (nums[rp] > threshold) {
                lp = rp;
                continue;
            }
            if (nums[rp] % 2 == nums[rp - 1] % 2) {
                lp = rp;
                continue;
            }


        }
        return max;
    }
}
