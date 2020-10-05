package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerSingleThreeTest {
    @Test
    public void whenTrackerSingleThree() {
        TrackerSingleThree one = TrackerSingleThree.getInstance();
        TrackerSingleThree two = TrackerSingleThree.getInstance();

        assertSame(one.getInstance(), two.getInstance());
    }
}