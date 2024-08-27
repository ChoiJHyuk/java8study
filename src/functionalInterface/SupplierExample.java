package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("John",2,3.8, "male", List.of("swiming, basketball"));
        Student student = studentSupplier.get();
        System.out.println(student);

        Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getAllStudents();
        List<Student> studentList = studentListSupplier.get();
        studentList.forEach((stu) -> System.out.println(stu));
    }
}
