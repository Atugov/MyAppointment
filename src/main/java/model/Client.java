package model;

import constants.Role;

import java.time.LocalDate;

public class Client extends User {

    LocalDate dateOfBirth;

    public Client(String login, String password, String email, LocalDate dateOfBirth, String name) {
        super(login, password, email, name);
        this.dateOfBirth = dateOfBirth;
        super.role = Role.CLIENT;

    }

}
