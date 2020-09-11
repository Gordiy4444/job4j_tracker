package ru.job4j.oop;

public class Builder extends Engineer {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Zac zac = new Zac();
        System.out.println(builder.con(zac));
    }
}
