package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char a = left.toCharArray();
        char b = right.toCharArray();
        Character.compare(a, b);
        return 0;
    }
}