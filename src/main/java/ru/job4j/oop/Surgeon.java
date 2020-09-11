package ru.job4j.oop;

public class Surgeon extends Doctor{
    public static void main(String[] args) {
        Profession prof = new Profession();
        System.out.println(prof.getName());
        Doctor doc = new Doctor();
        Pacient pac = new Pacient();
        System.out.println(doc.heal(pac));
        System.out.println(doc.getName());
        Surgeon sur = new Surgeon();
        System.out.println(sur.getName());
        System.out.println(sur.heal(pac));


    }
}
