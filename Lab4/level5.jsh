import java.util.*;

public Booking findBestBooking(Request req, Driver[] drivers) {
    PriorityQueue<Booking> pq = new PriorityQueue<Booking>();
    for(Driver driver : drivers) {
        pq.add(new Booking(driver,req));
    }
    return pq.peek();
}