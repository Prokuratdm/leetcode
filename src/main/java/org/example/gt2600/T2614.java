package org.example.gt2600;

public class T2614 {
    public int diagonalPrime(int[][] nums) {
        int currentMax = 0;
        for (int lines = 0; lines < nums.length; lines++) {
            int pos = lines;
            int mirrorPos= getMirrored(nums.length, pos);
            if(currentMax < nums[lines][pos] && isPrime(nums[lines][pos])) currentMax = nums[lines][pos];
            if(currentMax < nums[lines][mirrorPos] && isPrime(nums[lines][mirrorPos])) currentMax = nums[lines][mirrorPos];
        }
        return currentMax;
    }

    int getMirrored(int n, int pos){
        return n-1 - pos;
    }
    boolean isPrime(int n){
        if(n == 1) return false;
        int check = (int) Math.sqrt(n);
        for(int i = 2; i <= check; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
