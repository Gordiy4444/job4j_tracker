package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int a = left.length();
        int b = right.length();
        int size = Math.min(a, b);
        for (int i = 0; i < size; i++) {
            char t = left.charAt(i);
            char u = right.charAt(i);
            int rsl = Character.compare(t, u);
            {
                if (rsl != 0) {
                    return rsl;
                }
            }
        }
           return Integer.compare(a, b);
        }

}



