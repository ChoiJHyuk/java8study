package streamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSortedExample {
    public static void main(String[] args) {
        List<Student> collect1 = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
        List<Student> collect2 = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(collect2);
    }
}
