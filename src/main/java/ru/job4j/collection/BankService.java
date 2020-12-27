package ru.job4j.collection;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
       Optional <Optional<User>> user = Optional.of(findByPassport(passport));

        if (user.isPresent()) {

            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }

    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();

    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional <Optional<User>> user = Optional.of(findByPassport(passport));
        if (user.isPresent()) {
           return users.get(user)
                   .stream()
                   .filter(s -> s.getRequisite().equals(requisite))
                   .findFirst();
        }
            return Optional.empty();
        }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional <Optional<Account>> a = Optional.of(findByRequisite(srcPassport, srcRequisite));
        Optional <Optional<Account>> b = Optional.of(findByRequisite(destPassport, destRequisite));
        if (a.isPresent() && b.isPresent() && a.get().get().getBalance() >= (amount)) {
            a.get().get().setBalance(a.get().get().getBalance() - amount);
            b.get().get().setBalance(b.get().get().getBalance() + amount);
            return true;
        }
        return rsl;
    }
}