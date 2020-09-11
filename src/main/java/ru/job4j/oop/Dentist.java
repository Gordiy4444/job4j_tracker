package ru.job4j.oop;

public class Dentist extends Doctor {
    public static void main(String[] args) {
        Dentist dent = new Dentist();
        Pacient pac = new Pacient();
        System.out.println(dent.heal(pac));
    }
}
