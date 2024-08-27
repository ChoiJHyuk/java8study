package optional;

import java.util.Optional;

public class OptionalFactoryExample {
    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.ofNullable("Hello");
        System.out.println(stringOptional1);

        Optional<String> stringOptional2 = Optional.ofNullable(null);
        System.out.println(stringOptional2);

        Optional<String> stringOptional3 = Optional.of("Hello");
        System.out.println(stringOptional3);
//        of 팩토리 메소드에는 null을 건네주면 예외가 발생한다.
//        Optional<String> stringOptional4 = Optional.of(null);

        Optional<String> stringOptional5 = Optional.empty();
        System.out.println(stringOptional5);
    }
}
