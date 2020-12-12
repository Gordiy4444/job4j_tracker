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
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (Character rig : ri) {
            if (map2.containsKey(le)) {
                map2.put(rig, map2.get(rig) + 1);
            }
            map2.putIfAbsent(rig, 1);
        }
        return map1.equals(map2);
    }
}
