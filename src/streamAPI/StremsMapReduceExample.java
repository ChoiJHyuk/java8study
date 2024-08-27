package streamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StremsMapReduceExample {
    public static void main(String[] args) {
        int totalGradeLevel = getTotalGradeLevel();
        System.out.println(totalGradeLevel);
    }

    private static int getTotalGradeLevel(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getGradeLevel)
                .reduce(0, Integer::sum);
    }
}
