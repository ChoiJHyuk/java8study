package methodReference;

import data.Student;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RefactorMethodReferenceExample {
    public static Supplier<Student> studentSupplier = () -> new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming, basketball"));

    public static void main(String[] args) {
//        Predicate<Student> p = student -> student.getGradeLevel() >= 3;
//        Student에 메소드 생성 이후 참조
        Predicate<Student> p = Student::greaterThanGradeLevel;
        Student student = studentSupplier.get();
        System.out.println(p.test(student));
    }
}
