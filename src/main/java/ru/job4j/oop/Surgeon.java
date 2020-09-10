package ru.job4j.oop;

public class Surgeon extends Doctor{
    public static void main(String[] args) {
        Profession prof = new Profession();
        System.out.println(prof.getName());
        Doctor doc = new Doctor();
        System.out.println(doc.getName());
        System.out.println(doc.heal());
        Surgeon sur = new Surgeon();
        System.out.println(sur.getName());
        System.out.println(sur.heal());


    }
}
