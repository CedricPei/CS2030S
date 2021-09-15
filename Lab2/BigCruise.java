class BigCruise extends Cruise {
    private static final double LOADER_LENGTH = 40.0;
    private static final double TIME_PASSENGER = 50.0;

    public BigCruise(String name,int arrival,double length,double passengers) {
        super(name,arrival,(int) Math.ceil(length / LOADER_LENGTH),
            (int) Math.ceil(passengers / TIME_PASSENGER));
    }

}
