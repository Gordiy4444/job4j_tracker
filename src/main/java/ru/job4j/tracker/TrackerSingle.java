package ru.job4j.tracker;

import java.util.Arrays;

public enum TrackerSingle {
    INSTANCE;
    private Tracker instance;

    public Tracker getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        TrackerSingle tracker = TrackerSingle.INSTANCE;
    }
}