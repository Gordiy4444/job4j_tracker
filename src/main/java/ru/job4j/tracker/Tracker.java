package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new Item[100];
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
            Item name = items.get(index);
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
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
        int start = index + 1;
        int distPos = index;
        int length = size - index;
            System.arraycopy(items, start,items, distPos, length);
            items[size - 1] = null;
        size--;
        res = true;
        }
        return res;
    }
    }

