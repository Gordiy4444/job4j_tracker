package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerSingleTwoTest {
    @Test
    public void whenTrackerSingleTwo() {
        TrackerSingleTwo one = TrackerSingleTwo.getInstance();
        TrackerSingleTwo two = TrackerSingleTwo.getInstance();

        assertSame(one.getInstance(), two.getInstance());
    }
}