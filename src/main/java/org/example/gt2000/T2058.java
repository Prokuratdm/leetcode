package org.example.gt2000;

import org.example.common.ListNode;

import java.util.ArrayList;

public class T2058 {

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = -1;
        boolean hasPrevious = false;
        int prevValue = -1;
        int counter = 0;
        ArrayList<Integer> criticalPoints = new ArrayList<>();

        while (head != null) {
            if (hasPrevious && head.next != null) {
                if (prevValue > head.val && head.next.val > head.val) {
                    criticalPoints.add(counter);
                }
                else if (prevValue < head.val && head.next.val < head.val) {
                    criticalPoints.add(counter);
                }
            }
            prevValue = head.val;
            head = head.next;
            counter++;
            hasPrevious = true;
        }

        if (criticalPoints.size()<2) { return new int[]{-1, -1};}

        for (int i = 1; i < criticalPoints.size(); i++) {
            int distance = criticalPoints.get(i-1) - criticalPoints.get(i);
            if (distance < minDistance) {
                minDistance = distance;
            }
        }
        maxDistance = criticalPoints.get(criticalPoints.size()-1) - criticalPoints.get(0);


        return new int[]{minDistance, maxDistance};
    }
}
