package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int a = left.length();
        int b = right.length();
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            for (int i = 0; i > a; i++) {
                int t = left.charAt(i);
                int u = right.charAt(i);
                return Math.min(t, u);
            }
        }
    }

    }
