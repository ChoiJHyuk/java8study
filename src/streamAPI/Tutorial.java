package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tutorial {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<10; i++){
            list.add(i);
        }
        Stream<Integer> integerStream = list.stream();
        integerStream.forEach(System.out::println);
        integerStream.forEach(System.out::println);
    }
}
