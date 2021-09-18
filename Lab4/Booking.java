public class Booking implements Comparable<Booking> {
    private final Driver driver;
    private final Request request;

    public Booking(Driver driver,Request request) {
        this.driver = driver;
        this.request = request;
    }

    public Service getService() {
        if (this.driver.getServices()[0].computeFare(request) < this.driver.getServices()[1].computeFare(request)) {
            return this.driver.getServices()[0];
        } else {
           return this.driver.getServices()[1];
        }
    }

    public int getFare() {
        int fare = this.getService().computeFare(request);
        return fare;
    }

    @Override
    public int compareTo(Booking otherBooking) {
        if (this.getFare() > otherBooking.getFare()) {
            return 1;
        } else if (this.getFare() < otherBooking.getFare()) {
            return -1;
        } else if (this.driver.getWaittime() < otherBooking.driver.getWaittime()) {
            return -1;
        } else if (this.driver.getWaittime() == otherBooking.driver.getWaittime()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        int fare = this.getFare();
        float dollar = (float) fare / 100;
        return String.format("$%.2f using %s (%s)",dollar,driver,this.getService());
    }
}