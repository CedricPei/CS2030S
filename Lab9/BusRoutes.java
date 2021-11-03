import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

class BusRoutes {
    private final BusStop stop;
    private final String name;
    private final Map<BusService,CompletableFuture<Set<BusStop>>> services;

    BusRoutes(BusStop stop, String name, Map<BusService,CompletableFuture<Set<BusStop>>> services) {
        this.stop = stop;
        this.name = name;
        this.services = services;
    }

    public CompletableFuture<String> description() {
        String result = "Search for: " + this.stop + " <-> " + name + ":\n" +
            "From " +  this.stop + "\n";
        CompletableFuture<String> resultFinal = CompletableFuture.supplyAsync(() -> result);

        for (BusService service: services.keySet()) {
            CompletableFuture<Set<BusStop>> stops = services.get(service);
            resultFinal = resultFinal.thenCombine(describeService(service, stops),(x,y) -> x + y);
        }
        return resultFinal;
    }

    public CompletableFuture<String> describeService(BusService service,
        CompletableFuture<Set<BusStop>> stops) {
        CompletableFuture<String> result = stops
            .thenApply(x -> {
                if (x.isEmpty()) {
                    return "";
                } else {
                    return x.stream().filter(stop -> stop != this.stop)
                        .reduce("- Can take " + service + " to:\n",
                            (str,stop) -> str += "  - " + stop + "\n",
                            (str1,str2) -> str1 + str2);
                }
            });
        return result;
    }
}
