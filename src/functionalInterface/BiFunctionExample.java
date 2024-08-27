package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate)
                -> {
            Map<String, Double> studentGradeMap = new HashMap<>();
            students.forEach(student -> {
                if (studentPredicate.test(student)) {
                    studentGradeMap.put(student.getName(), student.getGpa());
                }
            });
            return studentGradeMap;
        };

        List<Student> studentList = StudentDataBase.getAllStudents();
        Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
        Map<String, Double> result = biFunction.apply(studentList,studentPredicate);

        result.forEach((name, gpa)->{
            System.out.println(name+":"+gpa);
        });
    }
}
