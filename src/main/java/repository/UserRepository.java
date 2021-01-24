package repository;

import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRepository {
    private static UserRepository userRepository;
    private Scanner scanner;
    List<User> users = new ArrayList<>();

    private UserRepository() {
    }

    public static UserRepository getInstance() {
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    public void addNewUser() {
        users.add(UserService.getInstance().createUser());
    }

    public void deleteUser(User user) {
        users.removeIf(a -> a.getLogin().equals(user.getLogin()));
    }

    public void editUser(User user) {
        UserService.getInstance().editUser(user);
    }
}
