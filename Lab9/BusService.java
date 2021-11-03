import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.concurrent.CompletableFuture;

class BusService {
    private final String serviceId;
    
    public BusService(String id) {
        this.serviceId = id;
    }
    
    public CompletableFuture<Set<BusStop>> getBusStops() {
        CompletableFuture<Set<BusStop>> stops = BusAPI.getBusStopsServedBy(serviceId)
            .thenApply(x -> new Scanner(x).useDelimiter("\n").tokens()
                .map(line -> line.split(","))
                    .map(fields -> new BusStop(fields[0], fields[1])).collect(Collectors.toSet()));
        return stops;
    }

    public CompletableFuture<Set<BusStop>> findStopsWith(String name) {
        return getBusStops().thenApply(x -> x.stream().filter(stop -> stop.matchName(name))
            .collect(Collectors.toSet()));
    }
    
    @Override
    public int hashCode() {
        return serviceId.hashCode();
    }

    @Override
    public boolean equals(Object busService) {
        if (busService instanceof BusService) {
            return this.serviceId.equals(((BusService)busService).serviceId);
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return serviceId;
    }
}
