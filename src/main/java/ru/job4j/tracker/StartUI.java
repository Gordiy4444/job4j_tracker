package ru.job4j.tracker;


public class StartUI {

    public static void findAll(Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void replaceItem(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("id"));
        String name = input.askStr("name");
        Item it = new Item(name);
        if (tracker.replace(id, it)) {
            System.out.println("Операция успешна");
        } else {
            System.out.println("Операция не успешна");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        int idDel = Integer.parseInt(input.askStr("idDel"));
        if (tracker.delete(idDel)) {
            System.out.println("Оперция успешна");
        } else {
            System.out.println("Оперция не успешна");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        int idSe = Integer.parseInt(input.askStr("idSe"));
        Item ite = tracker.findById(idSe);
        if (ite != null) {
            System.out.println(ite);
        } else {
            System.out.println("Заявка не найдена");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        String idR = input.askStr("idR");
        tracker.findByName(idR);
        Item[] iti = tracker.findByName(idR);
        if (iti.length > 0) {
            for (int i = 0; i < iti.length; i++) {
                System.out.println(iti[i]);
            }
        }    else{
            System.out.println("Заявки с таким именем не найдены");
                }
                }
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}