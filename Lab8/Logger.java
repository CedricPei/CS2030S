import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Optional;

public class Logger<T> implements Supplier<Logger<T>> {

    private final T value;
    private final ArrayList<String> log;


    public ArrayList<String> getLog() {
        return log;
    }

    /**
     * constructor1.
     */
    public Logger(T value) {
        this.value = value;
        this.log = new ArrayList<>();
        if (Optional.ofNullable(this.value).isPresent()) {
            this.log.add(value.toString());
        }
    }
    
    /**
     * constructor2.
     */
    public Logger(T value,ArrayList<String> log) {
        this.value = value;
        this.log = new ArrayList<>();
        this.log.addAll(log);
    }



    /**
     * give value.
     */
    public static <U> Logger<U> of(U value) {
        if (!Optional.ofNullable(value).isPresent()) {
            throw new IllegalArgumentException("argument cannot be null");
        }

        if (value instanceof Logger) {
            throw new IllegalArgumentException("already a Logger");
        }

        return new Logger<U>(value);
    }

    /**
     * map.
     */
    public <R> Logger<R> map(Function<? super T, ? extends R> function) {
        Logger<T> logger = this.get();
        T value = logger.value;
        ArrayList<String> log = logger.log;

        Mlogger<R> mLogger = new Mlogger<>();
        R r = mLogger.r;

        Logger<R> rLogger = new Logger<>(r,log) {
            @Override
            public Logger<R> get() {
                R newValue = function.apply(value);
                ArrayList<String> newLog = new ArrayList<>(log);
                newLog.add(newValue.toString());
                return new Logger<R>(newValue,newLog);
            }
        };
        return rLogger;
    }

    /**
     * flatMap.
     */
    public <R> Logger<R> flatMap(Function<? super T, ? extends Logger<? extends R>> function) {
        Logger<T> getLogger = this.get();
        Logger<? extends R> newLogger = function.apply(getLogger.value);
        Logger<? extends R> logger = newLogger.get();
        R v = logger.value;
        ArrayList<String> log = logger.log;
        if (logger.log.size() > 1 && getLogger.log.size() > 1) {
            for (int i = 0; i < getLogger.log.size() - 1; i++) {
                log.add(0,getLogger.log.get(i));
            }
        }
        Logger<R> rLogger = new Logger<R>(v, log);
        return rLogger;
    }

    public boolean test(Predicate<T> pred) {
        Logger<T> logger = this.get();
        return pred.test(logger.value);
    }

    Logger<T> test(Predicate<? super T> pred,
                   Supplier<Logger<T>> trueLogger,
                   Supplier<Logger<T>> falseLogger) {
        Logger<T> tLogger = this.get();
        if (pred.test(tLogger.value)) {
            return trueLogger.get();
        }
        return falseLogger.get();
    }

    @Override 
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Logger) {
            Logger<?> loggerObject = (Logger<?>) object;
            Logger<T> logger = this.get();
            return logger.toString().equals(loggerObject.toString());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        Logger<T> logger = this.get();
        ArrayList<String> log = logger.log;
        T value = logger.value;

        String loggerString = "Logger[" + value + "]";
        String logString = "";
        if (log.size() == 1) {
            return loggerString;
        } else {
            for (int i = 0; i < log.size() - 1; i++) {
                logString += log.get(i) + " -> " + log.get(i + 1);
                if (i < log.size() - 2) {
                    logString += "\n";
                }
            }
            return loggerString + "\n" + logString;
        }
    }

    @Override
    public Logger<T> get() {
        return this;
    }
}
