public abstract class RideService {
    
    //rate is in cents per km
    private final int rate;
    private final int fee;
    private final int surcharge;
    private final boolean division;

    public RideService(int rate, int fee, int surcharge, boolean division) {
        this.rate = rate;
        this.fee = fee;
        this.surcharge = surcharge;
        this.division = division;
    }

    public int computeFare(Request request) {
        int distance = request.getDistance();
        int passengers = request.getPassengers();
        int time = request.getTime();

        int fare = rate * distance + fee;
        if ((time >= 600) && (time <= 900)) {
            fare += surcharge;
        }
        if (division == true) {
            fare /= passengers;
        }
        return fare;
    }

}

      

        

