package ru.job4j.collection;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())// создаю поток  Diamonds, Hearts, Spades, Clubs
                .flatMap(a -> Stream.of(Value.values())//Добавляю к этоу потоку
                        .map(b -> a + " " + b))
                .forEach(System.out::println);
    }
    }

