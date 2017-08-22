package cn.sepiggy.ioc;

import org.springframework.stereotype.Component;

@Component
public class QunarBookingService implements BookingService {
    @Override
    public void bookFlight() {
        System.out.println("book flight by Qunar!");
    }
}
