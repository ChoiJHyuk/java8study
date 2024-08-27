package streamAPI;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsFactoryExample {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .forEach(System.out::println);

        Stream.iterate(1, n -> n * 2)
                .limit(3)
                .forEach(System.out::println);

        Stream.generate(new Random()::nextInt)
                .limit(3)
                .forEach(System.out::println);
    }
}
