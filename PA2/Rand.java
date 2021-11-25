import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class Rand<T> {
    private final Integer random;
    private final Function<Integer, T> func;

    Rand(Integer random, Function<Integer, T> func) {
        this.random = random;
        this.func = func;
    }

    static Rand<Integer> of(Integer random) {
        return of(random, x -> x);
    }

    static <T> Rand<T> of(Integer random, Function<Integer, T> func) {
        return new Rand<T>(random, func);
    }

    public T get() {
        return func.apply(this.random);
    }

    public Rand<T> next() {
        int newRandom = new Random(this.random).nextInt(Integer.MAX_VALUE);
        return new Rand<>(newRandom, func);
    }

    public Stream<T> stream() {
        Stream<T> stream = Stream.iterate(random, x -> Rand.of(x).next().random).map(x -> func.apply(x));
        return stream;
    }

    public <R> Rand<R> map(Function<T, R> mapper) {
        return Rand.of(random, mapper.compose(func));
    }

    public <R> Rand<R> flatMap(Function<T, Rand<R>> func) {
        Function<Rand<R>, R> unwrapper = x -> x.get();
        return map(unwrapper.compose(func));
    }

    static <U> Stream<U> randRange(int random, Function<Integer, U> func) {
        Stream<Integer> randomstream = Rand.of(random).stream();
        Stream<U> result = randomstream.map(func);
        return result;
    }

    @Override
    public String toString() {
        return "Rand";
    }
}



