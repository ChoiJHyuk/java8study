package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args){
        List<Student> studentList = StudentDataBase.getAllStudents();

        Consumer<Student> printName = (student) -> System.out.println(student.getName());

        //foreach함수는 Consumer<>타입을 인자로 받고, 각 인자마다 accept함수를 실행한다.
        studentList.forEach(printName);

        Consumer<Student> printActivities = student -> System.out.println(student.getActivities());

        //.andThen을 통해 이어서 실행할 Consumer<>타입을 지정할 수 있다.
        studentList.forEach(printName.andThen(printActivities));

        printNameActivitiesUsingCondition();
    }

    public static void printNameActivitiesUsingCondition(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3){
                System.out.println(student.getName()+": ");
                System.out.println(student.getActivities());
            }
        });
    }
}
