class SmallCruise extends Cruise {
    private static final int DURATION = 30;
    private static final int LOADER_REQUIRED = 1;

    public SmallCruise(String identifier,int arrivalTime) {
        super(identifier,arrivalTime,LOADER_REQUIRED,DURATION);
    }
}
