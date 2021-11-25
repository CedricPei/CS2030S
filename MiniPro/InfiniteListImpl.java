import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.Optional;


class InfiniteListImpl<T> implements InfiniteList<T> {

    private final Lazy<T> head;
    private final Supplier<InfiniteListImpl<T>> tail;


    protected InfiniteListImpl(Lazy<T> head, Supplier<InfiniteListImpl<T>> tail) {
        this.head = head;
        this.tail = tail;
    }

    public static <T> InfiniteListImpl<T> generate(Supplier<? extends T> s) {
        return new InfiniteListImpl<T>(
                Lazy.generate(s),
                () -> InfiniteListImpl.generate(s)
        );
    }


    public static <T> InfiniteListImpl<T> iterate(T seed, UnaryOperator<T> next) {
        return new InfiniteListImpl<T>(
                Lazy.ofNullable(seed),
                () -> InfiniteListImpl.iterate(next.apply(seed), next)
        );
    }

    public InfiniteListImpl<T> peek() {
        head.get().ifPresent(System.out::println);
        return this.tail.get(); 
    }

    public <R> InfiniteListImpl<R> map(Function<? super T, ? extends R> mapper) {
        return new InfiniteListImpl<R>(
            this.head.map(mapper),
            () -> this.tail.get().map(mapper)
        );
    }
  
    public InfiniteListImpl<T> filter(Predicate<? super T> predicate) {
        return new InfiniteListImpl<T>(
            this.head.filter(predicate),
            () -> this.tail.get().filter(predicate)
        );
    }

    public InfiniteListImpl<T> limit(long n) {

        if (n <= 0) {
            return new EmptyList<T>();
        } else if (n == 1) {
            return new InfiniteListImpl<T>(head, () -> {
                return NullUtil.isOpEmpty(head.get())
                    ? tail.get().limit(n)
                    : new EmptyList<>();
            });
        } else {
            return new InfiniteListImpl<T>(head, () -> {
                return NullUtil.isOpEmpty(head.get())
                    ? tail.get().limit(n)
                    : tail.get().limit(n-1);
            });
        }
    }

    public InfiniteListImpl<T> takeWhile(Predicate<? super T> predicate) {
       Lazy<T> newHead = this.head.filter(predicate);
       return new InfiniteListImpl<>(
           newHead,
           () -> {
               return NullUtil.isOpEmpty(this.head.get()) || NullUtil.isOpPresent(newHead.get())
                   ? this.tail.get().takeWhile(predicate)
                   : new EmptyList<>();
           }
       );
    }

    public void forEach(Consumer<? super T> action) {
        InfiniteListImpl<T> curr = this;
        while (!curr.isEmpty()) {
            curr.head.get().ifPresent(action); 
            curr = curr.tail.get();
        }
    }

    public long count() {
        return this.reduce(0, (x,y) -> x+1);
    }
              
    public <U> U reduce (U identity, BiFunction<U, ? super T, U> accumulator) {
        U result = identity;
        InfiniteListImpl<T> curr = this;
        while (!curr.isEmpty()) {
            Optional<T> element = curr.head.get();
            Lazy<T> lazy = new Lazy<>(Lazy.getMagicNum());
            T other = lazy.getMyT();
            if (NullUtil.isOpPresent(element)) {
                result = accumulator.apply(result, element.orElse(other));
            }
            curr = curr.tail.get();
        } 
        return result;
    }

    public Object[] toArray() {
        ArrayList<T> temp = new ArrayList<>();
        this.forEach(item -> temp.add(item));
        return temp.toArray();
    }

    public boolean isEmpty() {
        return false;
    }

}
