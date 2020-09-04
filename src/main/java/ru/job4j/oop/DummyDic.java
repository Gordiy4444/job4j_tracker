package ru.job4j.oop;

public class DummyDic {
    public String  engToRus() {
        String dic = "Известное слово";
        return dic;
    }

    public static void main(String[] args) {
        DummyDic dicky = new DummyDic();
        String eng = dicky.engToRus();
        System.out.println("Неизвестное слово. " + eng);
    }
}


