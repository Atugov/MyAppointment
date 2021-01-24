package model;

import constants.Role;
import constants.Service;

import java.util.HashMap;
import java.util.Map;

public class Employee extends User {
    protected Map<Service, Double> priceListOfEmployee;


    public Employee(String login, String password, String email, String name) {
        super(login, password, email, name);
        super.role = Role.EMPLOYEE;
        priceListOfEmployee = new HashMap<>();
    }

    public Map<Service, Double> getPriceListOfEmployee() {
        return priceListOfEmployee;
    }

    public void setPriceListOfEmployee(Service service, Double price) {
        this.priceListOfEmployee.put(service, price);
    }
}
