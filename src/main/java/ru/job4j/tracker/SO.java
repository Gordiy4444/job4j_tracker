package ru.job4j.tracker;

import java.util.Comparator;

public class SO implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        Integer a = first.getId();
        Integer b = second.getId();
        return b.compareTo(a);
    }
}
