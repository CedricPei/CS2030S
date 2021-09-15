class Loader {
    private final int identifier;
    private final Cruise cruise;
    
    public Loader(int identifier,Cruise cruise) {
        this.identifier = identifier;
        this.cruise =  cruise;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public int getNextAvailableTime() {
        return this.cruise.getServiceCompletionTime();
    }

    public boolean canServe(Cruise newCruise) {
        return this.cruise.getServiceCompletionTime() <= newCruise.getArrivalTime();
    }

    /**
    *this method is used to reallocate a loader.
    */
    public Loader serve(Cruise newCruise) {
        if (this.canServe(newCruise)) {
            return new Loader(this.identifier,newCruise);
        } else {
            return new Loader(this.identifier,this.cruise);
        }
    }
    
    public Cruise getCurrentCruise() {
        return this.cruise;
    }

    @Override
    public String toString() {
        return String.format("Loader %d serving ",this.identifier) + this.cruise.toString();
    }
}   
 
