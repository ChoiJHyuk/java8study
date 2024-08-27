package defaults_static;

import java.util.List;
import java.util.stream.IntStream;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();

        List<Integer> list = IntStream.rangeClosed(1, 5).boxed().toList();

        System.out.println(multiplier.size(list));
        System.out.println(multiplier.multiply(list));
        System.out.println(Multiplier.isEmpty(list));
    }
}
