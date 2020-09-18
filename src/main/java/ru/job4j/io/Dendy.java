package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int run = 11;
        boolean player = false;
        while (run > 0) {
            System.out.println("Игра");
            int select = Integer.valueOf(input.nextLine());
            String name = player ? "игрок_1" : "игрок_2";
            if(select >= 1 && select <= 3) {
                run -= select;
                if (run <= 0) {
                    System.out.println("Победил игрок: " + name);
                    break;
                    player = !player;
                }
            else {
                System.out.println("неверные данные");
                Integer.valueOf(input.nextLine());
            if (run == 0){
                player = !player;
                System.out.println(player);
            }
        }
            System.out.println();
        }
    }
}

