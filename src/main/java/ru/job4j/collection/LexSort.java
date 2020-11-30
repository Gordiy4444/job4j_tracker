package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        for (String a : left.split(".", 3)){
            Integer.parseInt(a);
        }
        for (String b : left.split(".", 3)) {
            Integer.parseInt(b);
        }

                return a.compareTo(b);
    }
}
