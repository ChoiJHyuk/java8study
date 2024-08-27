package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericMapToExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        list.stream().mapToInt(Integer::intValue)
                        .forEach(System.out::print);
        System.out.println();

        IntStream.rangeClosed(1, 3)
                .mapToLong(value -> value)
                .forEach(System.out::print);
        System.out.println();

        IntStream.rangeClosed(1, 3)
                .mapToDouble(value -> value)
                .forEach(System.out::print);
    }
}
