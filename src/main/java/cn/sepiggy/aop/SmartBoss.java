package cn.sepiggy.aop;

import cn.sepiggy.ioc.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartBoss {

    @Autowired
    private BookingService bookingService;

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingService getBookingService() {
        return bookingService;
    }

    public void goSomewhere() {
        bookingService.bookFlight();
    }
}

