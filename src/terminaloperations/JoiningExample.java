package terminaloperations;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class JoiningExample {
    public static void main(String[] args) {
        System.out.println(joining1());
        System.out.println(joining2());
        System.out.println(joining3());
    }

    private static String joining1() {
        return Stream.of("Adam", "Dan", "Julie")
                .collect(Collectors.joining());
    }

    private static String joining2() {
        return Stream.of("Adam", "Dan", "Julie")
                .collect(joining(", "));
    }

    private static String joining3() {
        return Stream.of("Adam", "Dan", "Julie")
                .collect(joining(", ", "[", "]"));
    }
}
