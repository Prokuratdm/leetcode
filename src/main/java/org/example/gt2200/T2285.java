package org.example.gt2200;

import java.util.ArrayList;

public class T2285 {
    public long maximumImportance(int n, int[][] roads) {
        int[] roadsCount = new int[n];
        for (int[] road : roads) {
            roadsCount[road[0]]++;
            roadsCount[road[1]]++;
        }

        ArrayList<RoadStat> roadStats = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            roadStats.add(new RoadStat(i, roadsCount[i]));
        }
        roadStats.sort((o1, o2) -> o1.roadsCount - o2.roadsCount);
        for (int i = 0; i < roadStats.size(); i++) {
            roadStats.get(i).setValue(i + 1);
        }

        int[] roadValues = new int[n];
        for (RoadStat roadStat : roadStats) {
            roadValues[roadStat.number] = roadStat.value;
        }
        long result = 0;
        for (int[] road : roads) {
            result += roadValues[road[0]] + roadValues[road[1]];
        }
        return result;
    }

    class RoadStat {
        int number;
        int roadsCount;
        int value;

        public RoadStat(int number, int roadsCount) {
            this.number = number;
            this.roadsCount = roadsCount;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
