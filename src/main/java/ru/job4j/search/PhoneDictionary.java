package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
        private ArrayList<Person> persons = new ArrayList<Person>();

        public void add(Person person) {
            this.persons.add(person);
        }

        public ArrayList<Person> find(String key) {
           Predicate<Person> name = person -> person.getName().contains(key);
           Predicate<Person> surname = person -> person.getSurname().contains(key);
           Predicate<Person> adress = person -> person.getAddress().contains(key);
           Predicate<Person> phone = person -> person.getPhone().contains(key);
           Predicate<Person> combine =  name.or(surname.or(adress.or(phone)));
            ArrayList<Person> result = new ArrayList<>();
            for (Person person : persons) {
                if (combine.test(person)) {
                    result.add(person);
                }
            }
            return result;
        }
    public static void main(String[] args) {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Dmitriy", "Gordeev", "98765", "Samara"));
        for (Person value : phones.find("Gor")) {
            System.out.println(value);
        }

        }
    }


