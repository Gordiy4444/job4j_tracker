package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String ab : origin){
            check.add(ab);
            ab.split("");
        }
        for (String vg : text)
            rsl = check.contains(vg);
        return rsl;
    }
}

