package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Gordeev D.D.");
        student.setGroup("6191");
        student.setDate("00.00.00.");
        System.out.println(student.getDate() + student.getGroup() + student.getFio());
    }
}
