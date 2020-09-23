package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    @Override
    public String name() {
        return "FindByName item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
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
        return true;
    }
}
