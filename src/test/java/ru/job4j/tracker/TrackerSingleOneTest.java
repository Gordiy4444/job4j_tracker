package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerSingleOneTest  {
    @Test
    public void whenTrackerSingleOne(){
        TrackerSingle one = TrackerSingle.INSTANCE;
        TrackerSingle two = TrackerSingle.INSTANCE;

        assertSame(one,two);
    }
}