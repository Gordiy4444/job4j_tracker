package ru.job4j.tracker;

import java.util.Comparator;

public class S implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        Integer a = first.getId();
        Integer b = second.getId();
        return a.compareTo(b);
    }
}


