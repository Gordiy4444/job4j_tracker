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
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("");
        }

        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException b) {
            b.printStackTrace();
            System.out.println("The user is not valid.");
        } catch (UserNotFoundException a) {
            a.printStackTrace();
            System.out.println("User not found");

        }
    }
}