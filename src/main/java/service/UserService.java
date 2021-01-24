package service;

import constants.Role;
import constants.Service;
import model.Client;
import model.Employee;
import model.User;

import java.time.LocalDate;
import java.util.Scanner;

public class UserService {
    private static UserService userService;
    private Scanner scanner;

    private UserService() {
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public User createUser() {
        User user = null;
        System.out.println("Enter your Role");
        String role = scanner.next();
        if (role.equals(Role.CLIENT.toString())) {
            System.out.println("Enter your login");
            String login = scanner.next();
            System.out.println("Enter your password");
            String password = scanner.next();
            System.out.println("Enter your email");
            String email = scanner.next();
            System.out.println("Enter your date of birth");
            System.out.println("Enter year:");
            int year = scanner.nextInt();
            System.out.println("Enter month:");
            int month = scanner.nextInt();
            System.out.println("Enter day:");
            int day = scanner.nextInt();
            LocalDate dob = LocalDate.of(year, month, day);
            System.out.println("Enter your name");
            String name = scanner.next();
            user = new Client(login, password, email, dob, name);
        }
        if (role.equals(Role.EMPLOYEE.toString())) {
            System.out.println("Enter your login");
            String login = scanner.next();
            System.out.println("Enter your password");
            String password = scanner.next();
            System.out.println("Enter your email");
            String email = scanner.next();
            System.out.println("Enter your name");
            String name = scanner.next();
            user = new Employee(login, password, email, name);
        }
        return user;
    }

    public void editUser(User user) {
        if (user instanceof Client) {
            editClientProfile(user);
        }
        if (user.getRole().equals(Role.ADMIN)) {
            System.out.println("it's admin");
        }
        if (user instanceof Employee) {
            editEmployeeProfile(user);
        }
    }

    protected User editClientProfile(User user) {

        System.out.println("What would you like to change?");
        System.out.println("1: name.");
        System.out.println("2: password.");
        System.out.println("3: email.");
        int optionNumber = scanner.nextInt();
        if (optionNumber == 1) {
            System.out.println("Enter new name");
            String newName = scanner.next();
            user.setName(newName);
        }
        if (optionNumber == 2) {
            System.out.println("Enter new password");
            String newPassword = scanner.next();
            user.setPassword(newPassword);
        }
        if (optionNumber == 3) {
            System.out.println("Enter new email");
            String newEmail = scanner.next();
            user.setEmail(newEmail);
        }
        return user;
    }

    protected User editEmployeeProfile(User user) {
        Employee employee = (Employee) user;
        System.out.println("What would you like to change?");
        System.out.println("1: name.");
        System.out.println("2: password.");
        System.out.println("3: email.");
        System.out.println("4: add services and prices.");
        int optionNumber = scanner.nextInt();
        if (optionNumber == 1) {
            System.out.println("Enter new name");
            String newName = scanner.next();
            user.setName(newName);
        }
        if (optionNumber == 2) {
            System.out.println("Enter new password");
            String newPassword = scanner.next();
            user.setPassword(newPassword);
        }
        if (optionNumber == 3) {
            System.out.println("Enter new email");
            String newEmail = scanner.next();
            user.setEmail(newEmail);
        }
        if (optionNumber == 4) {
            System.out.println("Enter the name of service");
            String newService = scanner.next();
            Service haircut = null;
            if (newService.equals(Service.HAIRCUT.getServiceName())) {
                haircut = Service.HAIRCUT;
            }
            System.out.println("Enter the name of price");
            double newPrice = scanner.nextInt();
            employee.setPriceListOfEmployee(haircut, newPrice);

        }
        return employee;
    }

}
