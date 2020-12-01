package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] a = left.split(("\\. "));
        for (int i = 0; i <= 0; i++){
            Integer g = Integer.parseInt(a[i]);
        }
        String[] b = right.split(("\\. "));
        for (int in = 0; in <= 0; in++){
            Integer h = Integer.parseInt(b[in]);
        }

        return g.compareTo(h);
    }
}
