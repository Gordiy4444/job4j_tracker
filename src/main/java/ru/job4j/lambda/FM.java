package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class FM {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(7, 9),
                List.of(10, 4)
        );
        System.out.println(matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList()));
    }
    }

