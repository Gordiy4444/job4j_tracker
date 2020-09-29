package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                rsl = index;
                break;

            }

        }
        if (rsl == -1) {
            throw new UserNotFoundException("it is impossible without an element");
        }
        return users[rsl];
    }

    public static boolean validate(User user) throws UserInvalidException {
        for (int index = 0; index < users.length; index++) {
            String el = users[index];
            if (user.isValid() == false && el.length < 3) {
                 throw new UserInvalidException("");
            }
        }
            return true;
        }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
