package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item[] findAll(List<Item>) {
        return items;
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
        return index != -1 ?  items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
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
            items.set(id, item);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean res = index != -1;
        if (res) {
        items.remove(index);
        res = true;
        }
        return res;
    }
    }

