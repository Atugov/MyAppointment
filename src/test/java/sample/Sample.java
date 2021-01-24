package sample;

import constants.Service;
import model.Booking;
import model.Client;
import model.Employee;
import model.User;
import org.junit.jupiter.api.Test;
import service.UserService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sample {

    @Test
    public void bookingTest() {
        Employee employee1 = new Employee("employee1", "employee1", "email", "Alex");
        Client client1 = new Client("client1", "client1", "email", LocalDate.of(2000, 1, 1), "Dima");
        Client client2 = new Client("client2", "client2", "email", LocalDate.of(2005, 2, 2), "Piter");
        LocalDateTime beginningTime1 = LocalDateTime.of(2021, 1, 22, 12, 00);
        LocalDateTime beginningTime2 = LocalDateTime.of(2021, 1, 22, 14, 00);
        LocalDateTime finishingTime1 = LocalDateTime.of(2021, 1, 22, 14, 00);
        LocalDateTime finishingTime2 = LocalDateTime.of(2021, 1, 22, 16, 00);

        Booking booking1 = new Booking(employee1.getId(), client1.getId(), beginningTime1, finishingTime1, Service.HAIRCUT);
        Booking booking2 = new Booking(employee1.getId(), client2.getId(), beginningTime2, finishingTime2, Service.MANICURE);


    }


}

