package cn.sepiggy.ioc;

public class CtripBookingService implements BookingService {
  @Override
  public void bookFlight() {
    System.out.println("book flight by Ctrip!");
  }
}
