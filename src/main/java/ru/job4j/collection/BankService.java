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
        User user = findByPassport(passport);{
            if (user != null){
                users.get(user);
                if (!users.containsKey(user)){
                    users.putIfAbsent(account, new ArrayList<>());
                }
            }
        }
    }
    public User findByPassport(String passport) {
        for(User u : users.keySet()){
            if (u.getPassport().equals(passport));
            {
                return u;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}