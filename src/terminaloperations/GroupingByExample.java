package terminaloperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGroupingByGPA();
        twoLevelGrouping();
        twoLevelGroupingWithSummingInt();
    }

    private static void groupStudentsByGender() {
        Map<String, List<Student>> collect = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(collect);
    }

    private static void customizedGroupingByGPA() {
        Map<String, List<Student>> collect = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> {
                    if (student.getGpa() >= 3.8)
                        return "Outstanding";
                    else
                        return "Average";
                }));
        System.out.println(collect);
    }

    private static void twoLevelGrouping() {
        Map<Integer, Map<String, List<Student>>> collect = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> {
                            if (student.getGpa() >= 3.8)
                                return "Outstanding";
                            else
                                return "Average";
                        })));
        System.out.println(collect);
    }

    private static void twoLevelGroupingWithSummingInt() {
        Map<Integer, Integer> collect = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getGradeLevel)));
        System.out.println(collect);
    }
}
