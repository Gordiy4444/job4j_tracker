package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr("Select"));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = input.askStr("name");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            }
            else if (select == 2) {
                int id = Integer.parseInt(input.askStr("id"));
                int name = Integer.parseInt(input.askStr("name"));
                Item it = new Item(name);
                if (tracker.replace(id, it)) {
                    System.out.println("Оперция успешна");
                } else {
                    System.out.println("Оперция не успешна");
                }
            }
            else if (select == 3) {
                int idDel = Integer.parseInt(input.askStr("idDel"));
                if (tracker.delete(idDel)) {
                    System.out.println("Оперция успешна");
                } else {
                    System.out.println("Оперция не успешна");
                }
            }
            else if (select == 4) {
                int idSe = Integer.parseInt(input.askStr("idSe"));
                Item ite = tracker.findById(idSe);
                if (ite != null) {
                    System.out.println(ite);
                } else {
                    System.out.println("Заявка не найдена");
                }
            }
                else if (select == 5) {
                String idR = input.askStr("idR");
                tracker.findByName(idR);
                Item[] iti = tracker.findByName(idR);
                    if (iti.length > 0) {
                        for (int i = 0; i < iti.length; i++) {
                            System.out.println(iti[i]);
                        }
                    } else {
                        System.out.println("Заявки с таким именем не найдены");

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
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            new StartUI().init(input, tracker);
        }
        }
