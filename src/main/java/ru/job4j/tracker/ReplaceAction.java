package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace item";
    }

        @Override
        public boolean execute(Input input, Tracker tracker) {
            int id = Integer.parseInt(input.askStr("id"));
            String name = input.askStr("name");
            Item it = new Item(name);
            if (tracker.replace(id, it)) {
                out.println("Операция успешна");
            } else {
                out.println("Операция не успешна");
            }
            return true;
        }
    }

