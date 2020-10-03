package ru.job4j.tracker;

public enum TrackerSingle {
    INSTANCE;
    private Tracker instance;

    public Tracker getInstance() {
        return instance;
    }
}
