package ru.job4j.collection;

import java.util.HashMap;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] le = left.toCharArray();
        char[] ri = right.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (Character lef : le) {
            if (map1.containsKey(le)) {
                map1.put(lef, map1.get(lef) + 1);
            }
            map1.putIfAbsent(lef, 1);
        }
        for (Character re : ri) {
            if (map1.get(re) > 1) {
                map1.put(re, map1.get(re) - 1);
            }
            if (map1.get(re) < 1) {
                map1.remove(re);
            }
        }
        return map1.containsValue(0);
    }
}
