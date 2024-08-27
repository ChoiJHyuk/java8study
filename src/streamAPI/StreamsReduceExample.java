package streamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7);

        int result1 = performMultipleication(numbers);
        System.out.println(result1);
        Optional<Integer> result2 = performMultipleicationWithoutIdentity(numbers);
        System.out.println(result2.orElseThrow());
        Optional<Student> highestGPAStudent = getHighestGPAStudent();
        System.out.println(highestGPAStudent.orElseThrow());
    }

    private static int performMultipleication(List<Integer> numbers) {
        return numbers.stream()
                .reduce(3, (a,b)->a*b);
    }

    private static Optional<Integer> performMultipleicationWithoutIdentity(List<Integer> numbers) {
        return numbers.stream()
                .reduce((a,b)->a*b);
    }

    private static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa()>s2.getGpa()?s1:s2);
    }

}
