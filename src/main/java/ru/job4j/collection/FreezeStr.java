package ru.job4j.collection;

import java.util.HashSet;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rsl = true;
        char[] a = left.toCharArray();
        char[] b = right.toCharArray();
        String c = a.toString();
        String v = b.toString();
        HashSet<String> check = new HashSet<>();
        for (String ab : c) {
            check.add(ab);
        }

        for (String vg : v)
            if (!check.contains(vg)) {
                rsl = false;
                break;
            }
        return rsl;
    }
}




























