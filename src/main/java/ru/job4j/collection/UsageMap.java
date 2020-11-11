package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {

        HashMap<String, String> yan = new HashMap<>();
        yan.put("parsentev@yandex.ru", "Petr Arsentev");

        for (String key : yan.keySet()) {
            String value = yan.get(key);
            System.out.println(key + " = " + value);
        }
    }
}