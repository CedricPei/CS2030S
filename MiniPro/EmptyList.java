import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.Optional;

class EmptyList<T> extends InfiniteListImpl<T> {

    EmptyList(){
        super(Lazy.ofNigger(Lazy.getMagicNum()), ()-> new EmptyList<T>());
    }

    public static <T> EmptyList<T> generate(Supplier<? extends T> s) {
        return new EmptyList<T>();
    }


    public static <T> EmptyList<T> iterate(T seed, UnaryOperator<T> next) {
        return new EmptyList<T>();
   }

    public EmptyList<T> peek() {
        return new EmptyList<T>();
    }

    public <R> EmptyList<R> map(Function<? super T, ? extends R> mapper) {
        return new EmptyList<R>();
    }
  
    public EmptyList<T> filter(Predicate<? super T> predicate) {
        return new EmptyList<T>();
    }

    public EmptyList<T> limit(long n) {
        return new EmptyList<T>();
    }

    public <U> U reduce (U identity, BiFunction<U, ? super T, U> accumulator) {
        return identity;
    }

    public long count() {
        return 0;
    }
    
    public Object[] toArray() {
        return new Object[0];
    }

    public EmptyList<T> takeWhile(Predicate<? super T> predicate) {
        return new EmptyList<T>();
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
