package org.example.gt2600;

public class T2660 {
    public int isWinner(int[] player1, int[] player2) {
        int p1t = countPoints(player1);
        int p2t = countPoints(player2);
        if (p1t == p2t) {
            return 0;
        }
        if (p1t > p2t) {
            return 1;
        }
        return 2;
    }

    public int countPoints(int[] player) {
        int total = 0;
        for (int i = 0; i < player.length; i++) {
            boolean mult = false;
            if (i - 1 >= 0 && player[i - 1] == 10) {
                mult = true;
            }
            if (i - 2 >= 0 && player[i - 2] == 10) {
                mult = true;
            }
            total += (mult ? 2 : 1) * player[i];
            mult = false;
        }
        return total;
    }
}
