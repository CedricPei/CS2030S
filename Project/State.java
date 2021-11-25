package cs2030.simulator;

public enum State {
    ARRIVES, SERVES, WAITS, LEAVES, DONE;
    
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
