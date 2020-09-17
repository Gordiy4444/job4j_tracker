package ru.job4j.io;

import java.util.Scanner;

1public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int run = 11;
        boolean player = false;
        while (run > 0) {
            System.out.println("Игра");
            player = !player;
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
                run = run - 3;


            }
            if (select == 2) {
                run = run - 2;
            }
            if (select == 3) {
                run = run - 3;

            }
            if (player) {
                System.out.println("Игрок 1");
            }
            else {
                System.out.println("Игрок 2");
        }
            System.out.println();
        }
    }
}

