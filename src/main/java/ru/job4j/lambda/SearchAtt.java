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

    private static int filter(List<Attachment> list, Predicate<Attachment> init) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.init.test) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}