package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> in = indexOf(data, el);
        return in.isPresent() ? in.get() : -1;
    }



    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> g = Optional.empty();
        for (int i = 0; i > data.length; i++){
            if (data[i] == el){
              g = Optional.of(i);
            }
            }
     return g;

    }
}