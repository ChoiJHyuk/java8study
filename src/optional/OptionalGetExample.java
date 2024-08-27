package optional;

import java.util.Optional;

public class OptionalGetExample {
    public static void main(String[] args) {
        System.out.println(getStudentName().orElse("default value"));
        System.out.println(getStudentName().orElseGet(()->"default value in suppler"));
        System.out.println(getStudentName().orElseThrow(()->new RuntimeException("no data")));
    }

    private static Optional<String> getStudentName() {
        return Optional.empty();
    }
}
