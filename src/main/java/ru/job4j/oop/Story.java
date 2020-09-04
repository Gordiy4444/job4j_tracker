package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Ball boll = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        boll.found(hare);
        hare.runaway(wolf);
        wolf.told(fox);
        fox.kill(boll);
    }
}

