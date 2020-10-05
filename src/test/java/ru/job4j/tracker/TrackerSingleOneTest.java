package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TrackerSingleOneTest  {
    @Test
    public void whenTrackerSingleOne(){
        TrackerSingleOne one = TrackerSingleOne.getInstance();
        TrackerSingleOne two = TrackerSingleOne.getInstance();

        assertSame(one.getInstance(), two.getInstance());
    }

}