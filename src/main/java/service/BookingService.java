package service;

import constants.Service;
import model.Booking;
import repository.BookingRepository;

import java.time.LocalDateTime;

public class BookingService {

    public void createBooking(String employeeId, String clientId, LocalDateTime beginningTime, LocalDateTime finishingTime, Service service) {
        BookingRepository.getInstance().addBooking(new Booking(employeeId, clientId, beginningTime, finishingTime, service));
    }

    public void deleteBooking(String employeeId, String clientId, LocalDateTime beginningTime, LocalDateTime finishingTime, Service service) {
        BookingRepository.getInstance().deleteBooking(new Booking(employeeId, clientId, beginningTime, finishingTime, service));

    }

}
