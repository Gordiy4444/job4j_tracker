package ru.job4j.oop;

import ru.job4j.pojo.Book;

public class Shop {

    public static int indexOfNull(Product[] products) {
        Product prod[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int index = 0; index <= prod.length; index++) {
            Product pro = prod[index];
            if (prod[index] != null) {
                int rsl = index;
                break;
            }
        }
    return rsl;
    }


    public static void main(String[] args) {
        Product prod[] = new Product[5];
        prod[0] = new Product("Milk", 10);
        prod[1] = new Product("Bread", 4);
        prod[2] = new Product("Egg", 19);
        System.out.println(prod);
            }
        }



