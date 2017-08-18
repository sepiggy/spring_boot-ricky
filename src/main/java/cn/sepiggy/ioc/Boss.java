package cn.sepiggy.ioc;

public class Boss {

    private BookingService bookingService;

    public Boss() {
        this.bookingService = new QunarBookingService();
    }

    public BookingService getBookingService() {
        return bookingService;
    }

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void goSomeWhere() {
        bookingService.bookFlight();
    }
}
