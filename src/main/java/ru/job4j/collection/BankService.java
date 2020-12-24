package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);

        if (user != null) {

            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }

    }

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
           return users.get(user)
                   .stream()
                   .filter(s -> s.getRequisite().equals(requisite))
                   .findFirst()
                   .orElse(null);
        }
            return null;
        }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account a = findByRequisite(srcPassport, srcRequisite);
        Account b = findByRequisite(destPassport, destRequisite);
        if (a != null && b != null && a.getBalance() >= (amount)) {
            a.setBalance(a.getBalance() - amount);
            b.setBalance(b.getBalance() + amount);
            return true;
        }
        return rsl;
    }
}