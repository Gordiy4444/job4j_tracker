package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("BMV");
        autos.add("LADA");
        autos.add("TOYOTA");
        autos.add("VOLVO");
        for (String name : autos) {
            System.out.println(name);
        }
    }
}
