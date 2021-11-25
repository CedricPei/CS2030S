package cs2030.simulator;

import java.util.ArrayList;
import java.util.List;

public class Recorder {
    private final List<Double> waitingTimes;
    //Level 1
    private final int customersServed;
    private final int customersLeft;
    private final int level;

    public Recorder() {
        this.waitingTimes = new ArrayList<>();
        this.customersServed = 0;
        this.customersLeft = 0;
        this.level = 0;
    }

    public Recorder(List<Double> waitingTimes, int customersServed, int customersLeft) {
        this.waitingTimes = waitingTimes;
        this.customersServed = customersServed;
        this.customersLeft = customersLeft;
        this.level = 1;
    }

    public void add(Double d) {
        waitingTimes.add(d);
    }
    
    public List<Double> getArr() {
        return this.waitingTimes;
    }

    public Recorder of(int served, int left) {
        return new Recorder(this.waitingTimes, served, left);
    }

    public Double averageWait() {
        double temp = 0.0;
        for (Double d : waitingTimes) {
            temp += d;
        }
        if (customersServed != 0) {
            return temp / customersServed;
        } else {
            return 0.0;
        }
    }

    public String toString() {
        return String.format("[%.3f %s %s]", averageWait(), customersServed, customersLeft);
    }
}

