package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DiapasonF {
    public static void main(String[] args) {
        List<Double> line = diapason(5, 8, x -> 2 * x + 1);
        System.out.println(line);
    }

    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> r = new ArrayList<>();
        for (int i = start; i < end; i++) {
            r.add(func.apply((double) i));
        }
        return r;
    }

    public static List<Double> diapasonp(int start, int end, Function<Double, Double> func) {
        List<Double> r = new ArrayList<>();
        for (int i = start; i < end; i++) {
            r.add(func.apply((double)i));
        }
        return r;
    }
}
