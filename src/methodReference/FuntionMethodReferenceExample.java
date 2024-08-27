package methodReference;

import java.util.function.UnaryOperator;

public class FuntionMethodReferenceExample {
    public static void main(String[] args) {
        UnaryOperator<String> toUpperCaseLambda = input -> input.toUpperCase();

        String result = toUpperCaseLambda.apply("java8");
        System.out.println(result);

        toUpperCaseLambda = String::toUpperCase;
        result = toUpperCaseLambda.apply("java8");
        System.out.println(result);
    }
}
