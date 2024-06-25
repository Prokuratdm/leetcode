package org.example.gt2700;

public class T2765 {
    public int alternatingSubarray(int[] nums) {
        int fast = 0;
        int slow = 0;
        int maxSize = 0;
        int currentSize=1;
        int currentVal=nums[slow];
        while (fast < nums.length) {
            if(fast+1 >= nums.length) {break;}
            if(currentVal==nums[fast+1]) {
                fast ++;
            }

            fast ++;
        }

        return maxSize;
    }
}
