package cs2030.simulator;

import java.util.Comparator;

public class EventComparator implements Comparator<Event> {
    @Override
    public int compare(Event e1, Event e2) {
        if (e1.getEventTime() > e2.getEventTime()) {
            return 1;
        } else if (e1.getEventTime() < e2.getEventTime()) {
            return -1;
        } else {
            Customer c1 = e1.getCust();
            Customer c2 = e2.getCust();

            if (c1.getId() > c2.getId()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
