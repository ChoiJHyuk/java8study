package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> result = sumSkipAndLimit(integers);
        System.out.println(result.orElseThrow());
    }

    private static Optional<Integer> sumSkipAndLimit(List<Integer> integers) {
        return integers.stream()
                .skip(5)
                .limit(1)
                .reduce(Integer::sum);
    }
}
