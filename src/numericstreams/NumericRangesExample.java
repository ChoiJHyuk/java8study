package numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericRangesExample {
    public static void main(String[] args) {
        IntStream range = IntStream.range(1, 5);
        range.forEach(value -> System.out.print(value + " "));
        System.out.println();
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        LongStream range1 = LongStream.range(1, 5);
        range1.forEach(value -> System.out.print(value + " "));
        System.out.println();
        LongStream longStream = LongStream.rangeClosed(1, 5);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        DoubleStream doubleStream = LongStream.range(1, 5)
                .asDoubleStream();
        doubleStream.forEach(value -> System.out.print(value+" "));
    }
}
