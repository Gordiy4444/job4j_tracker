package ru.job4j.oop;

public class DummyDic {
    public String  engToRus(String eng) {
        return  "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dicky = new DummyDic();
        String eng = dicky.engToRus("Известное слово");
        System.out.println(eng);
    }
}


