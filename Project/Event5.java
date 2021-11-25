package cs2030.simulator;

public class Event5 {
    private final Customer5 customer5;
    private final Server5 server5;
    private final double time;
    private final int state;

    protected static final int ARRIVES = 1;
    protected static final int SERVED = 2;
    protected static final int LEAVES = 3;
    protected static final int DONE = 4;
    protected static final int WAITS = 5;
    protected static final int SERVER_REST = 6;
    protected static final int SERVER_BACK = 7;

    /**
    * Constructs an Event instance given a customer, time, and state.
    * Nothing much happening beside assigning variables to their
    * respective values.
    */
    public Event5(Customer5 customer5, Server5 server5, double time, int state) {
        this.customer5 = customer5;
        this.server5 = server5;
        this.time = time;
        this.state = state;
    }

    public Customer5 getCustomer() {
        return customer5;
    }

    public Server5 getServer() {
        return server5;
    }

    public double getTime() {
        return time;
    }

    public int getState() {
        return state;
    }

    
    /**
    * Used to sort 'naturally' in a priority queue after implementing
    * Comparable. Earlier times get sorted first, and if times are
    * equal, Events by the lower consumer ID goes first.
    */
    /*
    public int compareTo(Event otherEvent) {
        if (time == otherEvent.getTime()) {
            int thisID = customer.getID();
            int thatID = otherEvent.getCustomer().getID();
            if (thisID < thatID) {
                return -1;
            } else if (thisID == thatID) {
                return 0;
            } else {
                return 1;
            }
        } else if (time < otherEvent.getTime()) {
            return -1;
        } else {
            return 1;
        }
    }
    */

    @Override
    public String toString() {
        String stateText = "no Event";
        if (state == ARRIVES) {
            return String.format("%.3f", time) + " " + customer5 +
                        " arrives";
        } else if (state == SERVED) {
            stateText = "serves";
            return String.format("%.3f", time) + " " + customer5 +
                    " " + stateText + " by " + server5;
        } else if (state == LEAVES) {
            return String.format("%.3f", time) + " " + customer5 +
                        " leaves"; 
        } else if (state == DONE) {
            stateText = "done serving";
            return String.format("%.3f", time) + " " + customer5 +
                    " " + stateText + " by " + server5;
        } else if (state == WAITS) {
            stateText = "waits at ";
            return String.format("%.3f", time) + " " + customer5 +
                    " " + stateText + server5;
        } else {
            return String.format("%.3f", time) + " " + customer5 +
                    " " + stateText + " by " + server5;
        }
    }
}
