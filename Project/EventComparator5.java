package cs2030.simulator;

import java.util.Comparator;

public class EventComparator5 implements Comparator<Event5> {
    /**
    * Compares an Event to another Event depending on which comes the earliest in time.
    * if times are the same, prioritizes the event associated with the customer with lowest ID.
    */
    @Override
    public int compare(Event5 e1, Event5 e2) {
        if (e1.getTime() == e2.getTime()) {
            int thisID = e1.getCustomer().getID();
            int thatID = e2.getCustomer().getID();
            if (thisID < thatID) {
                return -1;
            } else if (thisID == thatID) {
                return 0;
            } else {
                return 1;
            }
        } else if (e1.getTime() < e2.getTime()) {
            return -1;
        } else {
            return 1;
        }
    }
}