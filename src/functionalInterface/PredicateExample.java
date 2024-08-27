package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = a -> a % 2 == 0;
        Predicate<Integer> p2 = a -> a % 5 == 0;
        System.out.println(p1.and(p2).test(10));
        System.out.println(p1.and(p2).test(9));

        System.out.println(p1.or(p2).test(8));
        System.out.println(p1.or(p2).test(9));

        System.out.println(p1.or(p2).negate().test(8));

        filterStudentsByGradeLevel();
    }

    public static void filterStudentsByGradeLevel() {
        Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
        Predicate<Student> p2 = student -> student.getGpa() >= 3.9;
        Consumer<Student> c = student -> {
            if (p1.and(p2).test(student))
                System.out.println(student.getName() + ":" + student.getActivities());
        };

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(c);
    }
}
