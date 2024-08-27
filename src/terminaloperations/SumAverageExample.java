package terminaloperations;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class SumAverageExample {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(average());
    }

    private static int sum() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getGradeLevel));
    }

    private static double average() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingDouble(Student::getGpa));
    }
}
