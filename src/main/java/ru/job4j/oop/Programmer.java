package ru.job4j.oop;

public class Programmer extends Engineer {
    public static void main(String[] args) {
        Programmer pro = new Programmer();
        Zac zac = new Zac();
        System.out.println(pro.con(zac));
    }
}
