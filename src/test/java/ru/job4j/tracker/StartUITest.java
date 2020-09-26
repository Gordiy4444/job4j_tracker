package ru.job4j.tracker;


import org.junit.Test;
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
        UserAction[] actions = {
                new CreateAction(put),
                new ExitAction(put)
        };
        Output output = new ConsoleOutput();

        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
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
        UserAction[] actions = {
                new ReplaceAction(put),
                new ExitAction(put)
        };
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
        UserAction[] actions = {
                new DeleteAction(put),
                new ExitAction(put)
        };
        Output output = new ConsoleOutput();
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        Output put = new ConsoleOutput();
        UserAction[] actions = {
                new FindAllAction(put),
                new ExitAction(put)
        };

        Output output = new ConsoleOutput();
        new StartUI(output).init(in, tracker, actions);
        assertThat(put.toString(), is(""));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Output put = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(put),
                new ExitAction(put)
        };
        new StartUI(put).init(in, tracker, actions);
        assertThat(put.toString(), is(""));

    }


}
