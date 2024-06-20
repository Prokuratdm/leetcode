package org.example.gt1500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class T1552 {

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position); // Sort the positions array in ascending order
        int n = position.length;
        int left = 1; // Minimum possible force
        int right = position[n - 1] - position[0]; // Maximum possible force
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int balls = 1; // Number of balls placed in the baskets
            int prev = position[0];

            for (int i = 1; i < n; i++) {
                if (position[i] - prev >= mid) {
                    balls++;
                    prev = position[i];
                }
            }

            if (balls >= m) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;





    }

    public int maxDistance2(ArrayList<Integer> pos ) {
        return pos.get(pos.size()-1)-pos.get(0);
    }
}
