package ru.job4j.lambda;

import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return Stream.iterate(it, Iterator::hasNext, x -> x)
                .flatmap(iterators -> Stream.iterate(iterators.next(),Iterator::hasNext, UnaryOperator.identity()))
                .map(Iterator::next)
                .collect(Collectors.toList());
    }
}
