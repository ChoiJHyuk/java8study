package streamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamsCountExample {
    public static void main(String[] args) {
        long count = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(count);
    }
}
