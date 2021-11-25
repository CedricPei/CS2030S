import java.util.List;
import java.util.stream.Stream;


public class Main {

    public static double simulate(int seed, int n) {
        Circle circle = new Circle(new Point(0.0, 0.0), 1.0);

        long numPointsInCircle = Stream.iterate(Rand.of(seed), x -> x.next().next()).limit(n).map(x ->
                x.flatMap(y -> Rand.of(y).map(z -> List.of(getNormalizedValue(y), getNormalizedValue(z)))
                        .next()).get()).filter(x -> circle.contains(new Point(x.get(0), x.get(1)))).count();
        return 4.0 * numPointsInCircle / n;
    }

    private static double getNormalizedValue(int value){
        double lo = -1.0;
        double hi = 1.0;
        return (hi - lo) * value / (Integer.MAX_VALUE - 1) + lo;
    }
}
