import java.time.Instant;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.ArrayList;

public class Main {
    /**
     * Main Method.
     */
    public static void main(String[] args) {
        Instant start = Instant.now();
        Scanner scanner = new Scanner(System.in);

        List<CompletableFuture<String>> routes = new ArrayList<>();

        while (scanner.hasNext()) {
            BusStop srcId = new BusStop(scanner.next());
            String searchString = scanner.next();
            routes.add(BusSg.findBusServicesBetween(srcId, searchString)
                .thenCompose(x -> x.description()));
        }
        scanner.close();
        
        CompletableFuture.allOf(routes.toArray(new CompletableFuture<?>[0]));
        routes.stream().map(x -> x.join()).forEach(System.out::println);
        Instant stop = Instant.now();
        System.out.printf("Took %,dms\n", Duration.between(start, stop).toMillis());
    }
}
