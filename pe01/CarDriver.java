public abstract class CarDriver {
    
    protected final String license;
    protected final int waitTime;

    public CarDriver(String license, int waitTime) {
        this.license = license;
        this.waitTime = waitTime;
    }

    public int getWaitTime() {
        return this.waitTime;
    }

    @Override
    public String toString() {
        return String.format("%s (%d mins away)", license, waitTime);
    }

}

