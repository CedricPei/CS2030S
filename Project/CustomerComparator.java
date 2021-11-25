package cs2030.simulator;

import java.util.Comparator;


public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        if (c1.getArrivalTime() > c2.getArrivalTime()) {
            return 1;
        } else if (c1.getArrivalTime() < c2.getArrivalTime()) {
            return -1;
        } else {
            if (c1.getId() > c2.getId()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
