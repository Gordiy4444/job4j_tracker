package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {

        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;

            }

        }
            if (rsl == -1) {
                throw new ElementNotFoundException("it is impossible without an element");
            }
            return rsl;

        }

        public static void main(String[] args) {
            try {
                System.out.println(indexOf(new String[][]{"a", "b"}, "b"));
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
        }
    }





