package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class OptionalStreamTest {

    @Test
    public void test() {
        OptionalStream.PhoneNumber ph1 = new OptionalStream.PhoneNumber("+7 123 345 61 91");
        OptionalStream.PhoneNumber ph2 = new OptionalStream.PhoneNumber("+7 123 345 61 92");
        OptionalStream.PhoneNumber ph3 = new OptionalStream.PhoneNumber("+7 123 345 61 93");
        OptionalStream.PhoneNumber ph4 = new OptionalStream.PhoneNumber("+1 123 345 61 91");
        OptionalStream.PhoneNumber ph5 = new OptionalStream.PhoneNumber("+2 123 345 61 91");
        OptionalStream.PhoneNumber ph6 = new OptionalStream.PhoneNumber("+3 123 345 61 91");
        OptionalStream.User u1 = new OptionalStream.User(1, List.of(ph1));
        OptionalStream.User u2 = new OptionalStream.User(2, List.of(ph2));
        OptionalStream.User u3 = new OptionalStream.User(3, List.of(ph3, ph4, ph5));
        OptionalStream.User u4 = new OptionalStream.User(3, List.of(ph6));
        assertEquals(
                "+7 123 345 61 93",
                OptionalStream.collectNumber(List.of(u1, u2, u3, u4), 3, "+7").get(0).getPhone()
        );
    }

    @Test
    public void test2() {
        OptionalStream.PhoneNumber ph1 = new OptionalStream.PhoneNumber("+7 123 345 61 91");
        OptionalStream.PhoneNumber ph2 = new OptionalStream.PhoneNumber("+7 123 345 61 92");
        OptionalStream.PhoneNumber ph3 = new OptionalStream.PhoneNumber("+7 123 345 61 93");
        OptionalStream.PhoneNumber ph4 = new OptionalStream.PhoneNumber("+1 123 345 61 91");
        OptionalStream.PhoneNumber ph5 = new OptionalStream.PhoneNumber("+2 123 345 61 91");
        OptionalStream.PhoneNumber ph6 = new OptionalStream.PhoneNumber("+3 123 345 61 91");
        OptionalStream.User u1 = new OptionalStream.User(1, List.of(ph1));
        OptionalStream.User u2 = new OptionalStream.User(2, List.of(ph2));
        OptionalStream.User u3 = new OptionalStream.User(3, List.of(ph2, ph3, ph4, ph5));
        OptionalStream.User u4 = new OptionalStream.User(3, List.of(ph6));
        assertEquals(
                List.of(ph2.getPhone(), ph3.getPhone()),
                OptionalStream.collectNumber(List.of(u1, u2, u3, u4), 3, "+7").stream()
                        .map(OptionalStream.PhoneNumber::getPhone).collect(Collectors.toList())
        );
    }

}