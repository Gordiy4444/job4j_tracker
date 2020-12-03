package ru.job4j.tracker;

public class TrackerSingleTwo {
    private static final TrackerSingleTwo INSTANCE = new TrackerSingleTwo();
    private Tracker inst;

    public Tracker getInst() {
        return inst;
    }

    public static TrackerSingleTwo getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerSingleTwo tracker = TrackerSingleTwo.getInstance();
    }
}

