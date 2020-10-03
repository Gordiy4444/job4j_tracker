package ru.job4j.tracker;

public class TrackerSingleOne {
    private static TrackerSingleOne instance;
    private Tracker instance;

    public Tracker getInstance() {
        return instance;
    }

    private TrackerSingleOne() {
    }

    public static TrackerSingleOne getInstance() {
        if (instance == null) {
            instance = new TrackerSingleOne();
        }
        return instance;
    }

}

