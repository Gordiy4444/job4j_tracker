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
            if(select >= 1 && select <= 3) {
                run -= select;
            }
            else {
                System.out.println("неверные данные");
                select = Integer.valueOf(input.nextLine());
            if (run == 0){
                player = !player;
                System.out.println(player);
            }
            String name = player ? "игрок_1" : "игрок_2";
        }
            System.out.println();
        }
    }
}

