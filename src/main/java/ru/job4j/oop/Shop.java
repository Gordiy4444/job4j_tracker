package ru.job4j.oop;

public class Shop {

    public static int indexOfNull(Product[] products) {
        Product prod[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int index = 0; index <= prod.length; index++) {
            Product pro = prod[index];
            if (prod[index] != null) {
                pro = index;
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = indexOfNull();
        System.out.println(i);
            }
        }



