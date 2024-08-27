package streamAPI;

import data.Student;
import data.StudentDataBase;

public class StreamsMatchExample {
    public static void main(String[] args) {
        boolean allMatchResult = allMatch();
        System.out.println(allMatchResult);
        boolean anyMatchResult = anyMatch();
        System.out.println(anyMatchResult);
        boolean noneMatchResult = noneMatch();
        System.out.println(noneMatchResult);
    }

    private static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);
    }

    private static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()==4.1);
    }

    private static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()==4.0);
    }
}
