package methodReference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    /*public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;

        Student student = studentSupplier.get();
        System.out.println(student);
    }*/

    public static void main(String[] args) {
        Function<String, Student> studentFunction = Student::new;
        Student student = studentFunction.apply("choi");
        System.out.println(student);
    }
}
