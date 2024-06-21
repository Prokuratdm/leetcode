package org.example.gt600;

public class T605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int canBePlanted = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) { continue;}
            if(!isNextPlanted(flowerbed, i) && !isPreviousPlanted(flowerbed,i)) {
                canBePlanted++;
                flowerbed[i] = 1;
            }
        }

        return canBePlanted>=n;
    }

    private boolean isPreviousPlanted(int[] flowerbed, int n){
        if(n == 0) return false;
        if(flowerbed[n-1] == 1) return true;
        return false;
    }

    private boolean isNextPlanted(int[] flowerbed, int n){
        if(n == flowerbed.length-1) return false;
        if(flowerbed[n+1] == 1) return true;
        return false;
    }
}
