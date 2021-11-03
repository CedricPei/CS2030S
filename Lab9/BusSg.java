import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.CompletableFuture;

class BusSg {
    public static CompletableFuture<Set<BusService>> getBusServices(BusStop stop) {
        CompletableFuture<Set<BusService>> busServices = 
            BusAPI.getBusServicesAt(stop.getStopId()).thenApply(x -> new Scanner(x)
                .useDelimiter("\n").tokens().skip(1)
                    .flatMap(line -> Stream.of(line.split(","))).map(id -> new BusService(id))
                        .collect(Collectors.toSet()));
        return busServices;
    }

    public static CompletableFuture<BusRoutes> findBusServicesBetween(BusStop stop,
        String searchString) {
        CompletableFuture<BusRoutes> validServices = getBusServices(stop)
            .thenApply(x -> x.stream().collect(Collectors.toMap(service -> service, 
                service -> service.findStopsWith(searchString)))).handle((result,e) -> {
                    if (result == null) {
                        System.err.println("Unable to complete query: " + e);
                        return new BusRoutes(stop, searchString, Map.of());
                    } else {
                        return new BusRoutes(stop, searchString, result);
                    }
                });
        return validServices;
    }
}
