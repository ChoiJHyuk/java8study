package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingExample {
    public static void main(String[] args) {
        List<Integer> boxedIntegers = boxing();
        System.out.println(boxedIntegers);
    }

    private static List<Integer> boxing() {
        return IntStream.range(1,5)
                .boxed()
                .collect(Collectors.toList());
    }
}
