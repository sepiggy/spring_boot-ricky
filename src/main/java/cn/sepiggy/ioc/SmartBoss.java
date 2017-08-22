package cn.sepiggy.ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class SmartBoss {

    @Autowired
    private BookingService bookingService;

    public void goSomewhere() {
        bookingService.bookFlight();
    }
}
