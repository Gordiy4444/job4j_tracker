package ru.job4j.tracker;

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
        Item[] iti = tracker.findByName(idR);
        if (iti.length > 0) {
            for (int i = 0; i < iti.length; i++) {
                out.println(iti[i]);
            }
        }    else{
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
