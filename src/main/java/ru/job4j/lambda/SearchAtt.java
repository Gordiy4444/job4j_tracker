package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> init = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return false;
            }


    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> init = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                return false;
            }


    private static boolean filter(List<Attachment> list, Predicate<Attachment> init) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (init.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}