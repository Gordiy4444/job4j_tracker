package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class FM {
         public  List<Integer> con(int[][] matrix){
            return matrix.stream.flatMap(e -> e.stream()).collect(Collectors.toList());
         }
    }

