package ru.job4j.collection;

public class StringSort {
    public static void main(String[] args) {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        System.out.println(rst);
    }
}
