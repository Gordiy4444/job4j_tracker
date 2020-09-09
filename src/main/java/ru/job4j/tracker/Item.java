package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public Item() {
    }

    public Item( int id) {
    }
    public Item (int id, String name){

    }

    public static void main(String[] args) {
        Item item = new Item();
    }


    public LocalDateTime getCreated() {
        return created;

    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}