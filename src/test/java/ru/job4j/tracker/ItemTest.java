package ru.job4j.tracker;

import org.junit.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.list;
import static java.util.Collections.sort;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenByOrderSort() {
        List<Item> items = Arrays.asList(
                new Item(24, "K"),
                new Item(14, "O"),
                new Item(4, "P")
        );
        Collections.sort(items, new S());
        List<Item> expected = Arrays.asList(
                new Item(4, "P"),
                new Item(14, "O"),
                new Item(24, "K")
        );
        assertThat(items, is(expected));
    }
}