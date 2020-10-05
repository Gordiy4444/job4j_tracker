package ru.job4j.tracker;

public class TrackerSingleThree {
    private Tracker inst;

    public Tracker getInst() {
        return inst;
    }
    private TrackerSingleThree() {
    }

    public static TrackerSingleThree getInstance() {
        return Holder.INSTANCE;
    }


    private static final class Holder {
        private static final TrackerSingleThree INSTANCE = new TrackerSingleThree();
    }

    public static void main(String[] args) {
        TrackerSingleThree tracker = TrackerSingleThree.getInstance();
    }
}


