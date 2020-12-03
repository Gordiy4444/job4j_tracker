package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] a = left.split(("\\. "));
        Integer g = Integer.parseInt(a[0]);
        String[] b = right.split(("\\. "));
        Integer h = Integer.parseInt(b[0]);

        return Integer.compare(g, h);
    }
}
