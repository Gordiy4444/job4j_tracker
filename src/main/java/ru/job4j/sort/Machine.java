package ru.job4j.sort;


import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = money - price;
        for (int i = 0; i < COINS.length; i++)
            while (size > i){
                size += i;
            }

        return Arrays.copyOf(rsl, size);
    }
}
