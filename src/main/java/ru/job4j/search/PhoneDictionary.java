package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
        private ArrayList<Person> persons = new ArrayList<Person>();

        public void add(Person person) {
            this.persons.add(person);
        }

        public void search(String key, Person person){


        }
        public ArrayList<Person> find(String key) {
            ArrayList<Person> result = new ArrayList<>();
            return result;
        }
    }

