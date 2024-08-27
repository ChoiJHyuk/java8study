package streamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static void main(String[] args) {
        List<String> namesList = getNamesList();
        System.out.println(namesList);
    }

    public static List<String> getNamesList(){
        List<Student> students = StudentDataBase.getAllStudents();

        return students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
