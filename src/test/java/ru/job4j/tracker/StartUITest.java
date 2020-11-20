package ru.job4j.tracker;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        Output put = new ConsoleOutput();
        List<UserAction> actions =
                Arrays.asList(new CreateAction(put), new ExitAction(put));
        Output output = new ConsoleOutput();

        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        Output put = new ConsoleOutput();
        List<UserAction> actions =
                Arrays.asList(new ReplaceAction(put), new ExitAction(put));
        Output output = new ConsoleOutput();
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item("Deleted item"));

        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        Output put = new ConsoleOutput();
        List<UserAction> actions =
                Arrays.asList(new DeleteAction(put), new ExitAction(put));
        Output output = new ConsoleOutput();
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindAll() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        List<UserAction> actions =
                Arrays.asList(new FindAllAction(output), new ExitAction(output));
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString(), is("Menu." + ln
                + "0. FindAll item" + ln
                + "1. Exit" + ln + item + ln
                + "Menu." + ln + "0. FindAll item" + ln
                + "1. Exit" + ln));
    }

    @Test
    public void whenFindById() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions =
                Arrays.asList(new FindByIdAction(output), new ExitAction(output));
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString(), is( "Menu." + ln
                + "0. FindById item" + ln
                + "1. Exit" + ln + item + ln
                + "Menu." + ln + "0. FindById item" + ln
                + "1. Exit" + ln));
    }

    @Test
    public void whenFindByName() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getName()), "1"}
        );
        List<UserAction> actions =
                Arrays.asList(new FindByNameAction(output), new ExitAction(output));
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString(), is("Menu." + ln
                + "0. FindByName item" + ln
                + "1. Exit" + ln + item + ln
                + "Menu." + ln + "0. FindByName item" + ln
                + "1. Exit" + ln));
    }
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1","0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions =
                Arrays.asList(new ExitAction(out));
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }
}
