package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
        private ArrayList<Person> persons = new ArrayList<Person>();

        public void add(Person person) {
            this.persons.add(person);
        }

        public ArrayList<Person> find(String key) {
            ArrayList<Person> result = new ArrayList<>();
            for ( Person per : persons) {
                if (per.getName().contains(key) || per.getSurname().contains(key) || per.getAddress().contains(key) || per.getPhone().contains(key))
                    result.add(per);
                    System.out.println(per);
            }
            return result;
        }

    public static void main(String[] args) {
        ArrayList<Person> names = new ArrayList<Person>();
        names.add(new Person("Petr", "Arsentev", "534872","Bryansk"));
        names.add(new Person("Dmitriy", "Gordeev", "98765", "Samara"));
        main("Gor");

        for (Object value : names) {
            System.out.println(value);
        }
    }
    }

