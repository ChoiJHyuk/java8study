package optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.of("Hello");
        System.out.println(stringOptional1.isPresent());

        Optional<String> stringOptional2 = Optional.ofNullable(null);
        System.out.println(stringOptional2.isPresent());

        Optional<String> stringOptional3 = Optional.of("Hello");
        stringOptional3.ifPresent(System.out::println);

        Optional<String> stringOptional4 = Optional.ofNullable(null);
        stringOptional4.ifPresent(System.out::println);
    }
}
