package org.example.gt900;

import java.util.LinkedList;

public class T925 {

    public boolean isLongPressedName(String name, String typed) {
        LinkedList<LetterStat> statsName = createStats(name);
        LinkedList<LetterStat> statsTyped = createStats(typed);
        if (statsName.size() != statsTyped.size()) {
            return false;
        }

        var ni=statsName.iterator();
        var ti=statsTyped.iterator();

        for (int i = 0; i < statsName.size(); i++) {
            var nl=ni.next();
            var tl=ti.next();
            if(nl.letter!= tl.letter) return false;
            if (nl.count > tl.count) return false;
        }
        return true;


    }

    private LinkedList<LetterStat> createStats(String name) {
        LinkedList<LetterStat> statsName = new LinkedList<>();
        for (char c : name.toCharArray()) {
            if (statsName.isEmpty()) statsName.add(new LetterStat(c));
            else if (statsName.getLast().letter == c) {
                statsName.getLast().count++;
            } else {
                statsName.add(new LetterStat(c));
            }

        }
        return statsName;
    }

    class LetterStat {
        char letter;
        int count;

        public LetterStat(char letter) {
            this.letter = letter;
            count = 1;
        }


    }
}
