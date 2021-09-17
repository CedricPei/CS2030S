public class Booking implements Comparable<Booking> {

    private final CarDriver driver;
    private final RideService rideService;
    private final Request request;

    public Booking(CarDriver driver, RideService rideService,
            Request request) {
        this.driver = driver;
        this.rideService = rideService;
        this.request = request;
    }

    public int getFare() {
        return rideService.computeFare(request);
    }

    public int getWaiting() {
        return driver.getWaitTime();
    }

    @Override
    public int compareTo(Booking otherBooking) {
        if (this.getFare() > otherBooking.getFare()) {
            return 1;
        } else if (this.getFare() < otherBooking.getFare()) {
            return -1;
        } else if (this.getWaiting() < otherBooking.getWaiting()) {
            return -1;
        } else {
            return 1;
        }
    }


    @Override
    public String toString() {
        int fare = getFare();
        float dollarFare = (float) fare / 100;
        return String.format("$%.2f using %s (%s)", dollarFare, driver, rideService);
    }

}
