package functionalInterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = s -> Integer.parseInt(s);

        Integer result = toInteger.apply("123");
        System.out.println(result);

        Function<Integer, String> toString = s -> s.toString();

        String last = toInteger.andThen(toString).apply("8");
        System.out.println(last);

    }
}
