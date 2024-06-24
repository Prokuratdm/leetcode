package org.example.gt900;

public class T941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length<3) {return false;}
        int currentPos=0;
        //up
        int stepsUp=0;
        while (currentPos+1<arr.length){
            if (arr[currentPos]<arr[currentPos+1]){
                currentPos++;
            }
            else if (arr[currentPos]==arr[currentPos+1]){return false;}
            else break;
            stepsUp++;
        }
        if (stepsUp==0){return false;}

        //down
        int steps = 0;
        while (currentPos+1<arr.length){
            if (arr[currentPos]>arr[currentPos+1]){
                currentPos++;
            }
            else if (arr[currentPos]==arr[currentPos+1]){return false;}
            else break;
            steps++;
        }
        if (steps==0){return false;}
        return currentPos==arr.length-1;
    }
}
