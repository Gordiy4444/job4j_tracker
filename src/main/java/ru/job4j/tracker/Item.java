package ru.job4j.tracker;

import ru.job4j.collection.SortId;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Item implements Comparator<Item> {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    public Item() {

    }


    public Item(String name){
        this.name = name;
    }

    public Item(int id) {
      this.id = id;
    }

    public Item (int id, String name){
    this.id = id;
    this.name = name;


    }

    public int getId() {
        return id;
    }


    public static void main(String[] args) {
        List<Item> i = Arrays.asList(
                new Item(1234, "B"),
                new Item(1345, "C"),
                new Item(9876, "A")
        );
        System.out.println(i);
        Collections.sort(i, new Sortitem());
        System.out.println(i);
        Collections.sort(i, new SortId());
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
                ", created=" + created +
                ", formatter=" + formatter +
                '}';

    }


    @Override
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}