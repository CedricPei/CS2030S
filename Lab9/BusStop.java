class BusStop {
    private final String stopId;
    private final String name;

    public BusStop(String id, String name) {
        this.stopId = id;
        this.name = name;
    }

    public BusStop(String id) {
        this.stopId = id;
        this.name = "";
    }

    public String getStopId() {
        return this.stopId;
    }

    public boolean matchName(String name) {
        return this.name.toUpperCase().indexOf(name.toUpperCase()) != -1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BusStop)) {
            return false;
        }
        return ((BusStop)o).stopId.equals(this.stopId);
    }

    @Override
    public int hashCode() {
        return stopId.hashCode();
    }

    @Override
    public String toString() {
        return stopId + " " + name;
    }
}
