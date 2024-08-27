package streamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindExample {
    public static void main(String[] args) {
        Optional<Student> findAny = findAnyStudent();
        System.out.println(findAny.orElseThrow());
        Optional<Student> findFirst = findFirstStudent();
        System.out.println(findFirst);
    }

    private static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    private static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.5)
                .findFirst();
    }
}
