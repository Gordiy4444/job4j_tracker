package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            }
            else if (select == 2) {
                int id = Integer.parseInt(scanner.nextLine());
                int name = Integer.parseInt(scanner.nextLine());
                Item it = new Item(name);
                tracker.replace(id, it);
                if (tracker.replace(id, it)) {
                    System.out.println("Оперция успешна");
                } else {
                    System.out.println("Оперция не успешна");
                }
            }
            else if (select == 3) {
                int idDel = Integer.parseInt(scanner.nextLine());
                tracker.delete(idDel);
                Item it = new Item();
                if (tracker.replace(idDel, it)) {
                    System.out.println("Оперция успешна");
                } else {
                    System.out.println("Оперция не успешна");
                }
            }
            else if (select == 4) {
                int idSe = Integer.parseInt(scanner.nextLine());
                Item ite = tracker.findById(idSe);
                if (ite != null) {
                    System.out.println(ite);
                } else {
                    System.out.println("Заявка не найдена");
                }
            }
                else if (select == 5) {
                    int idR = Integer.parseInt(scanner.nextLine());
                    tracker.findByName(items[i]);
                    Item iti = new Item();
                    if (tracker.findByName(idR)) {
                        System.out.println("Оперция успешна");
                    } else {
                        System.out.println("Оперция не успешна");
                    }
                }

                     else if (select == 6) {
                         run = false;
            }
        }
    }
        private void showMenu() {
            System.out.println("Menu.");
            System.out.println("0 Add new Item");
            System.out.println("1. Show all items");
            System.out.println("2. Edit item");
            System.out.println("3. Delete item");
            System.out.println("4. Find item by Id");
            System.out.println("5. Find items by name");
            System.out.println("6. Exit Program");
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(scanner, tracker);
        }
    }