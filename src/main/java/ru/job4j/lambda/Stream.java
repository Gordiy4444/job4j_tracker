package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> in = List.of(1, 2, 3, -1, -2, -3);
        List<Integer> pos = in.stream().filter(i -> i > 0).collect(Collectors.toList());
        pos.forEach(System.out::println);
    }
}