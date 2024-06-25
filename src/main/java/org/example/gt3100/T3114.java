package org.example.gt3100;

public class T3114 {

    public String findLatestTime(String s) {

        var r = s.split(":");
        char firstH = r[0].charAt(0);
        char secondH = r[0].charAt(1);
        char firstM = r[1].charAt(0);
        char secondM = r[1].charAt(1);

        if (firstH == '?' && secondH == '?') {
            firstH = '1';
            secondH = '1';
        }

        if (firstM == '?' && secondM == '?') {
            firstM = '5';
            secondM = '9';
        }

        if (firstH == '?') {
            if (secondH > '1') {
                firstH = '1';
            } else firstH = '0';
        }

        if (secondH == '?') {
            if (firstH == '0') {
                secondH = '9';
            } else secondH = '1';
        }

        if (firstM == '?') {
            firstM = '5';
        }

        if (secondM == '?') {
            secondM = '9';
        }


        return "" + firstH + secondH + ":" + firstM + secondM;
    }
}
