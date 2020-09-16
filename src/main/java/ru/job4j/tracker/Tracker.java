package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);

        for (int index = 0; index < namesWithoutNull.length; index++)
            return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[this.size];
        int size = 0;
        for (int index = 0; index < this.size; index++) {
            Item name = size[index];
            if (name.getName().equals(key)) {
                names[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(names, size);

    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

}