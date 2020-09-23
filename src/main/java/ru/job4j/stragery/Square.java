package ru.job4j.stragery;

public class Square implements Shape {

        @Override
        public String draw() {
            String ln = System.lineSeparator();
            return  " _______"
                    + "         " + ln
                    + "|       |" + ln
                    + "|       | " + ln
                    + "|_______|" + ln;

    }
}
