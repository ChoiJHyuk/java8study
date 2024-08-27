package defaults_static;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> intgerList){
        return intgerList == null || intgerList.isEmpty();
    }
}
