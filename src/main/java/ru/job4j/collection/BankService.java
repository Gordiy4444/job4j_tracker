package ru.job4j.collection;

import java.util.*;

public class BankService {
        private Map<User, List<Account>> users = new HashMap<>();

        public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
        }

        public void addAccount(String passport, Account account) {
            Optional<User> user = findByPassport(passport);
            if (user.isPresent()) {
                List<Account> accounts = users.get(user.get());
                if (!accounts.contains(account)) {
                    accounts.add(account);
                }
            }

        }

        public Optional<User> findByPassport(String passport) {
            Optional<User> us = users.keySet()
                    .stream()
                    .filter(s -> s.getPassport().equals(passport))
                    .findFirst();
            if (us.isPresent()) {
                System.out.println(us.get());
            } else {
                System.out.println("Element not found.");
            }
            return us;
        }

        public Optional<Account> findByRequisite(String passport, String requisite) {
            Optional<User> user = findByPassport(passport);
            Optional<Account> us = user.flatMap(value -> users.get(value)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst());
            if (us.isPresent()) {
                System.out.println(us.get());
            } else {
                System.out.println("Element not found.");
            }
            return us;
        }


        public boolean transferMoney(String srcPassport, String srcRequisite,
                                     String destPassport, String destRequisite, double amount) {
            boolean rsl = false;
            Optional<Account> a = findByRequisite(srcPassport, srcRequisite);
            Optional<Account> b = findByRequisite(destPassport, destRequisite);
            if (a.isPresent() && b.isPresent() && a.get().getBalance() >= (amount)) {
                a.get().setBalance(a.get().getBalance() - amount);
                b.get().setBalance(b.get().getBalance() + amount);
                return true;
            }
            return rsl;
        }
    }