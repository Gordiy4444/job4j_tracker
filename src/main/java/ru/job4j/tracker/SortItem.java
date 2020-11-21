package ru.job4j.tracker;

import java.util.Comparator;

public class Sortitem implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().getId().compareTo(second.getName().getId());
    }
}