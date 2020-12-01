package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Item  {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Item() {

    }


    public Item(String name) {
        this.name = name;
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;


    }

    public int getId() {
        return id;
    }


    public static void main(String[] args) {
        List<Item> i = Arrays.asList(
                new Item(1, "B"),
                new Item(9, "C"),
                new Item(2, "A")
        );
        System.out.println(i);
        Collections.sort(i, new SortI());
        System.out.println(i);
        Collections.sort(i, new S());
        System.out.println(i);
        Collections.sort(i, new SO());
        System.out.println(i);
        Collections.sort(i, new Soit());
        System.out.println(i);
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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(name, item.name) &&
                Objects.equals(created, item.created) &&
                Objects.equals(formatter, item.formatter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, created, formatter);
    }
}