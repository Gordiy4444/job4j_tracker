package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int idSe = Integer.parseInt(input.askStr("idSe"));
        Item ite = tracker.findById(idSe);
        if (ite != null) {
            System.out.println(ite);
        } else {
            System.out.println("Заявка не найдена");
        }

        return false;
    }
}
