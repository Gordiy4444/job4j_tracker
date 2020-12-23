package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
       
    public static Map<String, Student> sortMap(List<Student> list) {
        return list.stream().collect(toMap(
                e -> e.getSurname(),
                e -> e,
                (first, second) -> first)
        );

    }

    }

