package ru.job4j.tracker;

import java.util.Comparator;

public class S implements Comparator<Item> {
    @Override
    public int compareTo(Item another) {
        return Integer.compare(getId(), another.getId());
    }
}
