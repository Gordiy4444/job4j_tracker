package ru.job4j.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {

    public static class User {

        private String name;

        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(Pair :: getUser, Collectors.summingInt(Pair :: getBill)));
    }

    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5, 6).stream()
                .collect(Collectors.groupingBy(n -> n % 2, Collectors.summingInt(n -> n))).forEach((k, v) -> System.out.println(k + " " + v));
    }
}