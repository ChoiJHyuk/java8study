package numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 50).sum();
        System.out.println(sum);

        OptionalInt max = IntStream.range(1, 50).max();
        System.out.println(max.orElseThrow());

        OptionalInt min = IntStream.range(1, 50).min();
        System.out.println(min.orElseThrow());

        OptionalDouble average = IntStream.range(1, 50).average();
        System.out.println(average.orElseThrow());
    }
}
