package functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

        int result = binaryOperator.apply(10,20);
        System.out.println(result);

        System.out.println("--------------------");

        maxByExample();
    }

    public static void maxByExample(){
        Comparator<Integer> comparator = (a,b)-> a.compareTo(b);

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

        int maxValue = maxBy.apply(4,5);
        System.out.println(maxValue);
    }
}
