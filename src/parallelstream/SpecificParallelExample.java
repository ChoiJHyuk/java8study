package parallelstream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SpecificParallelExample {
    public static void main(String[] args) {
        System.out.println("sequential "+checkPerformanceResult(SpecificParallelExample::sequentialStudentActivities));
        System.out.println("parallel "+checkPerformanceResult(SpecificParallelExample::parallelStudentActivities));


    }

    private static List<String> sequentialStudentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<String> parallelStudentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    private static long checkPerformanceResult(Supplier<List<String>> supplier) {
        long startTie = System.currentTimeMillis();
        supplier.get();
        long endTime = System.currentTimeMillis();
        return endTime - startTie;
    }
}
