public class RecycledLoader extends Loader {
    private static final int recycleTime = 60;

    public RecycledLoader(int identifier,Cruise cruise) {
        super(identifier,cruise);
    }

    @Override
    public int getNextAvailableTime() {
        return this.getCurrentCruise().getServiceCompletionTime() + recycleTime;
    }

    @Override
    public boolean canServe(Cruise newCruise) {
        return this.getNextAvailableTime() <= newCruise.getArrivalTime();
    }

    @Override
    public Loader serve(Cruise newCruise) {
        if (this.canServe(newCruise)) {
            return new RecycledLoader(this.getIdentifier(),newCruise);
        } else {
            return new RecycledLoader(this.getIdentifier(),this.getCurrentCruise());
        }
    }

    @Override
    public String toString() {
        return String.format("Recycled Loader %d serving ",
            this.getIdentifier()) + this.getCurrentCruise().toString();
    }
}