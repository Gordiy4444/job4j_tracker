package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        return rsl;
        break;
    }
            if (rsl == -1){
        throw new ElementNotFoundException("it is impossible without an element");
    }
    }



