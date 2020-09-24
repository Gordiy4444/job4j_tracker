package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "FindById item";
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

        return true;
    }
}
