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
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] names = new Item[this.size];
        int size = 0;
        for (int index = 0; index < this.size; index++) {
            Item name = items[index];
            if (name.getName().equals(key)) {
                names[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(names, size);

    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean res = false;
        int index = indexOf(id);
        int start = index + 1;
        int distPos = index;
        int length = size - index;
        items[size - 1] = null;
        size--;
        res = true;
        return res;
        System.arraycopy(items, index, start, distPos, length);
    }
    }

