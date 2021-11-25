import java.util.function.Supplier;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Function;

public class Lazy<T> {

    private Supplier<? extends T> sup;
    private T evaluated;
    private boolean cached;
    private static final int magicNum = 123;
    private T myT;

    private Supplier<T> supplier = new Supplier<>() {
        @Override
        public T get() {
            return null;
        }
    };

    public Supplier<T> getSupplier() {
        return supplier;
    }

    public T getMyT() {
        return myT;
    }

    public static int getMagicNum() {
        return magicNum;
    }

    public Lazy(int magicNum) {
        this.sup = sup;
    }

    private Lazy(Supplier<? extends T> sup) {
        this.sup = sup;
        evaluated = null;
        cached = false;
    }

    // overloaded method for cached evaluated values
    private Lazy(T evaluated) {
        this.evaluated = evaluated;
        sup = () -> evaluated;
        cached = true;
    }

    static <T> Lazy<T> of(T v) {
        return new Lazy<T>(v);
    }

    static <T> Lazy<T> of(Supplier<? extends T> supplier) {
        return new Lazy<T>(supplier);
    }

    static <T> Lazy<T> ofNullable(T v) {
         return new Lazy<T>(v);
    }

    static <T> Lazy<T> ofNigger(int magicNum) {
        return ofNullable(null);
    }

    static <T> Lazy<T> generate(Supplier<? extends T> supplier) {
        return new Lazy<T>(supplier);
    }

    <R> Lazy<R> map(Function<? super T, ? extends R> mapper) {
        return Lazy.generate( 
            ()-> this.get().map(mapper).orElse(null)
        );
    }

    Lazy<T> filter(Predicate<? super T> predicate) {
        return Lazy.generate( 
            ()-> this.get().filter(predicate).orElse(null)
        );
    }

    Optional<T> get() {
        if (cached) {
            return Optional.ofNullable(evaluated);
        } else {
            Optional<T> result = Optional.ofNullable(sup.get());
            this.evaluated = result.orElse(null);
            this.cached = true;
            return result; 
        }
    }

    @Override 
    public String toString() {
        return cached ? "Lazy[" + evaluated + "]" : "Lazy[?]";
    }

}
