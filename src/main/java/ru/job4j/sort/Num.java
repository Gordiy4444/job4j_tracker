package ru.job4j.sort;

import ru.job4j.oop.Product;

public class Num {
    public static Number[] num(Number[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                numbers[0] = numbers[1];
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        Number[] numbers = new Number[4];
        numbers[0] = new Number(8);
        numbers[1] = new Number(2);
        numbers[2] = new Number(-8);
        numbers[3] = new Number(-2);
        Number[] rsl = num(numbers);
        for (int i = 0; i < rsl.length; i++) {
            Number number = numbers[i];
            System.out.println(number);
        }
    }
}