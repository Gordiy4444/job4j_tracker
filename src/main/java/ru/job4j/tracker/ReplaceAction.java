package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name(){
        return null;
    }


        @Override
        public boolean execute(Input input, Tracker tracker) {
            int id = Integer.parseInt(input.askStr("id"));
            String name = input.askStr("name");
            Item it = new Item(name);
            if (tracker.replace(id, it)) {
                System.out.println("Операция успешна");
            } else {
                System.out.println("Операция не успешна");
            }
            return false;
        }
    }

