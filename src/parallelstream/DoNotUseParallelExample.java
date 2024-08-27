package parallelstream;

import java.util.stream.IntStream;

class Sum{
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input){
        total+=input;
    }
}

public class DoNotUseParallelExample {
    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.rangeClosed(1,1000)
                .forEach(sum::performSum);
        System.out.println("sequential "+sum.getTotal());

        sum.setTotal(0);
        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum);
        System.out.println("parallel "+sum.getTotal());
    }
}
