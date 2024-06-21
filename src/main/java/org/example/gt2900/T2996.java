package org.example.gt2900;

import java.util.Arrays;
import java.util.HashSet;

public class T2996 {

    public int missingInteger(int[] nums) {
        int lp = 0;
        int rp = 0;
        HashSet<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
        int maxSum = nums[lp];
        int currentSum = maxSum;
        while (rp < nums.length) {
            if (isNextSeq(nums, rp)) {
                rp++;
                currentSum += nums[rp];
                maxSum = Math.max(currentSum, maxSum);
            } else {
               break;
            }

        }
        for (int i = maxSum; true ; i++) {
            if (!set.contains(i)) { return i;}
        }
    }

    private boolean isNextSeq(int[] nums, int i) {
        if (i == nums.length - 1) {
            return false;
        }
        return nums[i] + 1 == nums[i + 1];
    }
}
