package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<Task> extractNumber(List<Task> list) {
        HashSet<Task> numbers = new HashSet<>();
        for (Task task: list) {
            task.getNumber();
            numbers.addAll(list);
            System.out.println(task);
        }
        return numbers;
        }

    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        extractNumber(tasks);
    }
    }

