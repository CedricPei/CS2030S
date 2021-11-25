package cs2030.simulator;

import java.util.List;

public class Customer {
    private final double arrivalTime;
    private final int id;
    private final State[] state;
    private final double[] serviceTime;
    private final double[] doneTime;
    private final boolean greedy;

    public Customer(int id, double arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.id = id;
        this.state = new State[]{State.ARRIVES};
        this.serviceTime = new double[]{1.0};
        this.greedy = false;
        this.doneTime = new double[]{0.0};
    }

    public Customer(int id, double arrivalTime, double serviceTime) {
        this.arrivalTime = arrivalTime;
        this.id = id;
        this.serviceTime = new double[]{serviceTime};
        this.state = new State[]{State.ARRIVES};
        this.greedy = false;
        this.doneTime = new double[]{0.0};
    }
    
    public Customer(int id, double arrivalTime, double serviceTime, State state) {
        this.arrivalTime = arrivalTime;
        this.id = id;
        this.state = new State[]{state};
        this.serviceTime = new double[]{serviceTime};
        this.greedy = false;
        this.doneTime = new double[]{0.0};
    }


    public Customer(int id, double arrivalTime, double serviceTime, boolean greedy) {
        this.arrivalTime = arrivalTime;
        this.id = id;
        this.state = new State[]{State.ARRIVES};
        this.serviceTime = new double[]{serviceTime};
        this.greedy = greedy;
        this.doneTime = new double[]{0.0};
    }

    public int getId() {
        return this.id;
    }

    public double getArrivalTime() {
        return this.arrivalTime;
    }

    public double getServiceTime() {
        return this.serviceTime[0];
    }
    
    public double getDoneTime() {
        return this.doneTime[0];
    }

    public State getState() {
        return this.state[0];
    }
    
    public boolean getGreed() {
        return this.greedy;
    }

    //no change in time

    public void get(String state) {
        if (state.equals("waits")) {
            this.state[0] = State.WAITS;
        } else if (state.equals("serves")) {
            this.state[0] = State.SERVES;
        } else if (state.equals("done")) {
            this.state[0] = State.DONE;
        } else {
            this.state[0] = State.LEAVES;
        }
    }

    public void done(double time) {
        this.doneTime[0] = this.serviceTime[0] + time;
    }

    public void serving(double time) {
        this.serviceTime[0] = time;
    }

    public String toString() {

        if (greedy) {
            return this.id + "(greedy) " + this.state[0];
        }
        return this.id + " " + this.state[0];

    }
}
