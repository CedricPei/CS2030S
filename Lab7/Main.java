import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Arrays;
import java.util.function.*;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static long countTwinPrimes(int n) {
        long cnt = 0;
        List<Integer> range = IntStream.rangeClosed(3, n)
                .boxed().collect(Collectors.toList());
        cnt = range.stream().filter(y -> IntStream.range(2,y).filter(x -> y % x == 0).count() == 0
                    && ((IntStream.range(2,y + 2).filter(x -> (y + 2) % x == 0).count() == 0)
                    || (IntStream.range(2,y - 2).filter(x -> (y - 2) % x == 0).count() == 0))).count();
        return cnt;
    }

    public static String reverse(String str) {
        String[] split = str.split("");
        Collections.reverse(Arrays.asList(split));
        List<String> collect = Arrays.stream(split).collect(Collectors.toList());
        return String.join("", collect);
    }

    public static long countRepeats(int... array) {
        AtomicInteger t4 = new AtomicInteger(0);
        AtomicInteger temp = new AtomicInteger(-1);
        AtomicInteger record = new AtomicInteger(-1);
    
        Arrays.stream(array).forEach(x ->{
            Optional.of(t4).filter(y -> temp.get()==x && x!=record.get()).map(AtomicInteger::getAndIncrement);
            Optional.of(record).map(y -> y.getAndAdd(-y.get()+temp.get()));
            Optional.of(temp).map(y -> y.getAndAdd(-y.get()+x));
        });
        return t4.get();
    }
    
    public static double normalizedMean(Stream<Integer> stream) {
        List<Integer> collect = stream.collect(Collectors.toList());
        long count = collect.size();
        Integer max = collect.stream().max(Integer::compareTo).orElse(0);
        Integer min = collect.stream().min(Integer::compareTo).orElse(0);
        Integer sum = collect.stream().reduce(Integer::sum).orElse(0);
        double aver = (double)sum / (double)count;
        double result = (aver - (double)min) / (max - min);
        return Optional.of(result).filter(x -> !x.isNaN()).orElse(0.0);
    }
}


