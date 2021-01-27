package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> user = Optional.ofNullable(null);
        for (String st : strings) {
            if (st.equals(value)) {
                user = Optional.ofNullable(st);
            }
        }
        return user;
    }
}
