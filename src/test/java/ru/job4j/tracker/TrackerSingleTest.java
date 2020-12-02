package ru.job4j.tracker;

import junit.framework.TestCase;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class TrackerSingleTest  {
    @Test
    public void whenTrackerSingle() {
        TrackerSingle one = TrackerSingle.INSTANCE;
        TrackerSingle two = TrackerSingle.INSTANCE;

        assertSame(one, two);
    }
}