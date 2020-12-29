package ru.job4j.lambda;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(5);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(x -> new Tuple(x.getName(), stream.flatMap(y -> y.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(5)))
                .collect(Collectors.toList());
    }



    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream().map(e -> new Tuple(e.getKey(), e.getValue()))
                .collect(Collectors.toList());

    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(x -> new Tuple(x.getName(), stream.flatMap(y -> y.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .sum()))
                .max((x, y) -> Integer.compare(x.getScore(), y.getScore())
                .orElse(null));

    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}

