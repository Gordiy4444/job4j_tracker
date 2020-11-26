package ru.job4j.tracker;

import java.util.Comparator;

public class SO implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        int a = first.getId();
        int b = second.getId();
        if (a < b){
            return -1;
        }
        else if (b < a){
            return 1;
        }
        else {
            return 0;
        }
    }
}
