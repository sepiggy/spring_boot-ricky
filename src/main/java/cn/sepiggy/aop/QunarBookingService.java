package cn.sepiggy.aop;

import org.springframework.stereotype.Component;

@Component
public class QunarBookingService implements BookingService {
    @Override
    public boolean bookFlight() {
        System.out.println("book flight by Qunar!");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return true;
    }
}
