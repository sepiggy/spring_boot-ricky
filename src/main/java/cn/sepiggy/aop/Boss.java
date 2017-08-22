package cn.sepiggy.aop;

import cn.sepiggy.ioc.BookingService;
import cn.sepiggy.ioc.QunarBookingService;

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

    public void goSomewhere() {
        long start = System.currentTimeMillis();

        bookingService.bookFlight();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long duration = System.currentTimeMillis() - start;

        // 查看耗时
        System.out.println(String.format("time for booking flight is %d ms", duration));

        // 记录日志
        System.out.println("booking flight succ!");
    }
}
