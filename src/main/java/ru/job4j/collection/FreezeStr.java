package ru.job4j.collection;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rsl = true;
        int a = left.length();
        int b = right.length();
        if (a == b) {
            char[] t = left.toCharArray();
            char[] g = right.toCharArray();
            for (char e : t) {
                if (e != g)
                    rsl = false;
                break;
            }
        }
            return;
        }
    }

