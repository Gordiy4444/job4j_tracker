package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int run = 11;
        boolean player = false;
        while (run > 0) {
            System.out.println("Игра");
            String name = player ? "игрок_1" : "игрок_2";
            System.out.println("Ходит игрок: " + name + ". Вы можете взять от 1 до 3 спичек.");
            int select = Integer.parseInt(input.nextLine());
            if (select >= 1 && select <= 3) {
                run -= select;
                if (run <= 0) {
                    System.out.println("Победил игрок: " + name);
                    break;
                }
                player = !player;
            } else {
                System.out.println("Введены неверные данные.");
            }
        }
    }
}

