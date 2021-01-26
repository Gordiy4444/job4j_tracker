package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
             max(data).ifPresent(integer -> System.out.println("Max: " + integer));
    }
    private static Optional<Integer> max(int[] data) {
        return Optional.of(Arrays
                .stream(data)
                .max()
                .orElse(0));
    }
}




