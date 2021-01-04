package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
             max(data).ifPresent(integer -> System.out.println("Max:" + max(data)));
    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> in = Optional.empty();
        int max = data[0];
        for (int index = 0; index < data.length; index++) {
            if (data[index] > max) {
                max = (data[index]);
                in = Optional.of(max);
            }
        }
        return in;
    }
}


