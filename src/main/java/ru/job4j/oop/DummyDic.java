package ru.job4j.oop;

public class DummyDic {
    public String  engToRus(String eng) {
        eng = "Известное слово";
        return  "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dicky = new DummyDic();
        String eng = dicky.engToRus("r");
        System.out.println(eng);
    }
}


