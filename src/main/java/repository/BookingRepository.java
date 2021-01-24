package repository;

import model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {
    private List<Booking> bookingList = new ArrayList<>();
    private static BookingRepository bookingRepository;

    private BookingRepository() {
    }

    public static BookingRepository getInstance() {
        if (bookingRepository == null) {
            bookingRepository = new BookingRepository();
        }
        return bookingRepository;
    }


    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }

    public void deleteBooking(Booking booking) {
        bookingList.removeIf(booking::equals);
    }
}
