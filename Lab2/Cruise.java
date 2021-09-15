class Cruise {
    private final String identifier;
    private final int arrivalTime;
    private final int numOfLoader;
    private final int serviceTime;    
    private static final int HUNDRED = 100;
    private static final int HOURMIN = 60;

    public Cruise(String identifier, int arrivalTime, int numOfLoader, int serviceTime) {
        this.identifier = identifier;
        this.arrivalTime = arrivalTime;
        this.numOfLoader = numOfLoader;
        this.serviceTime = serviceTime;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public int getArrivalTime() {
        int arrivalMinutes = 0;
        if (this.arrivalTime >= HUNDRED) {
            arrivalMinutes = Math.floorDiv(this.arrivalTime,HUNDRED) * HOURMIN
                + this.arrivalTime % HUNDRED;
        } else {
            arrivalMinutes = this.arrivalTime;
        }
        return arrivalMinutes;
    }

    public int getNumOfLoadersRequired() {
        return this.numOfLoader;
    }

    public int getServiceCompletionTime() {
        int completionTime = this.getArrivalTime() + this.serviceTime;
        return completionTime;
    }
    
    @Override
    public String toString() {
        return this.identifier + String.format("@%04d",this.arrivalTime);
    }
}
