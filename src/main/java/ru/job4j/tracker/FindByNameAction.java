package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction{
    private final Output out;

    public FindByNameAction(Output out) {
            this.out = out;
        }
    @Override
    public String name() {
        return "FindByName item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String idR = input.askStr("idR");
        tracker.findByName(idR);
        List<Item> iti = tracker.findByName(idR);
        if (iti.size() > 0) {
            for (int i = 0; i < iti.size(); i++) {
                out.println(iti.get(i));
            }
        }    else{
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
