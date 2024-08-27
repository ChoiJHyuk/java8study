package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("Value of A: " + a);
            System.out.println("Value of B: " + b);
        };

        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication is: " + (a * b));
        };

        multiply.accept(5,10);

        BiConsumer<Integer,Integer> division = (a,b)->{
            System.out.println("Division is: "+(a/b));
        };

        multiply.andThen(division).accept(10,5);

        printNameAndActivities();
    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String, List<String>> biConsumer = (name, activities)->{
            System.out.println(name+" : "+activities);
        };

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
}
