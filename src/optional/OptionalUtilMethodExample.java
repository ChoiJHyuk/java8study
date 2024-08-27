package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalUtilMethodExample {
    public static void main(String[] args) {
        Optional<Student> student1 = Optional.of(StudentDataBase.getAllStudents().get(0));
        student1
                .filter(student -> student.getGpa()>=3.8)
                .ifPresent(System.out::println);

        student1
                .map(Student::getName)
                .ifPresent(System.out::println);

        Student temp = StudentDataBase.getAllStudents().get(0);
        temp.setBike(Optional.of(new Bike("bike","1")));
        Optional<Student> student2 = Optional.of(temp);
        student2
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName)
                .ifPresent(System.out::println);
    }
}
