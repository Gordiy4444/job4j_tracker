package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerSingleThreeTest {
    @Test
    public void whenTrackerSingleThree() {
        TrackerSingle one = TrackerSingle.INSTANCE;
        TrackerSingle two = TrackerSingle.INSTANCE;
        one.getInstance();
        two.getInstance();

        assertSame(one.getInstance(), two.getInstance());
    }
}