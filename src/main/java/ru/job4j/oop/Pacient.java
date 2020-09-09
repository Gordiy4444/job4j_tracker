package ru.job4j.oop;

public class Pacient extends Doctor {


    public static void main(String[] args) {
        Profession profession = new Profession();
        System.out.println(profession);
        Doctor doctor = new Doctor();
        System.out.println(doctor.heal);
    }
}
