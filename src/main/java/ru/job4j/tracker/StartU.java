package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartU {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime current = item.getCreated();
        System.out.println(current);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println(formatter);
    }
}
