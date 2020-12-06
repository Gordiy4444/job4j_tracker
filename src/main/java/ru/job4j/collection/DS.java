package ru.job4j.collection;

import ru.job4j.tracker.S;

import java.util.Comparator;

public class DS implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a = o1.split("/");
        String[] b = o2.split("/");
            int res = o1.compareTo(o2);
            if (res != 0){
                return a[0].compareTo(b[0]);
            }
            return res;
        }
    }
