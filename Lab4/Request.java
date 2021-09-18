public class Request {
    private final int distance;
    private final int passengers;
    private final int time;

    public Request(int distance, int passengers, int time) {
        this.distance = distance;
        this.passengers = passengers;
        this.time = time;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public int getTime() {
        return this.time;
    }

    @Override
    public String toString() {
        String timeString = new String();
        timeString += String.format("%d",time);
        return String.format("%dkm for %dpax @ %shrs",distance,passengers,time);
    }
}
