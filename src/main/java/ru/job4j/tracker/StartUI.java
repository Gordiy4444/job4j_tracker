package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        Tracker tracker = new Tracker();
        System.out.println(tracker.add(item));
        System.out.println(tracker.findById(item.getId()));

    }
}
