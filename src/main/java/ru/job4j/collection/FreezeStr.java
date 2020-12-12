package ru.job4j.collection;

import java.util.HashMap;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] t = left.toCharArray();
        char[] p = right.toCharArray();
        HashMap<Character, Integer> q = new HashMap<>();
        for (Character l : t) {
            if (q.containsKey(l)){
                q.put(l,1 + 1);
            }
            q.putIfAbsent(l, 1);
        }
        return false;
    }
}
