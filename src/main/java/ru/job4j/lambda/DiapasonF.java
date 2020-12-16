package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DiapasonF {
    public static void main(String[] args) {
        List<Double> line = diapason(8, 9,x -> 2 * x + 1);
        System.out.println(line);
    }
    private static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> r = new ArrayList<>();
        for (int i = start; i < end; i++) {
            double in = i;
            func.apply(in);
            r.add(in);
        }
            return r;
        }
    }
