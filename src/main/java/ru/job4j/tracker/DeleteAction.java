package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    private final Output out;

    public DeleteAction (Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idDel = Integer.parseInt(input.askStr("idDel"));
        if (tracker.delete(idDel)) {
            System.out.println("Оперция успешна");
        } else {
            System.out.println("Оперция не успешна");
        }
        return true;
    }
}
