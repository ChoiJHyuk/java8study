package parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("sequential " + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("parallel " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
    }

    private static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 10000000)
                .sum();
    }

    private static int sumParallelStream() {
        return IntStream.rangeClosed(1, 10000000)
                .parallel()
                .sum();
    }

    private static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {
        long startTie = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTie;
    }
}
