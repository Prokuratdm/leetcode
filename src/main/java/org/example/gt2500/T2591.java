package org.example.gt2500;

import java.util.Arrays;

public class T2591 {

    public int distMoney(int money, int children) {
        if (money < children) return -1;
        int[] res = new int[children];
        int currentMoney = money;
        for (int i = 0; i < children; i++) {
            res[i]++;
            currentMoney--;
        }
        //try max 8 dollars
        for (int i = 0; i < children; i++) {
            int needToAdd = 8 - res[i];
            if (currentMoney < needToAdd) {
                res[i] += currentMoney;
                currentMoney = 0;
                break;
            }
            res[i] += needToAdd;
            currentMoney -= needToAdd;
        }

        if (currentMoney > 0) res[children - 1] += currentMoney;

        // exclude 4
        if (res[0] == 4) return 0;

        for (int i = 1; i < children; i++) {
            if (res[i] == 4) {
                res[i]--;
                if (i != children - 1) res[i + 1]++;
                else res[i - 1]++;
            }
        }

        return Arrays.stream(res).reduce(0, (r, val) -> val == 8 ? r + 1 : r);


    }
}
