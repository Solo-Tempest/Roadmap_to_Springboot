package Phase_1.week_3.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q12_SortStudents {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("aditya", 75),
                new Student("saksham", 95),
                new Student("rupali", 85),
                new Student("shreya", 90),
                new Student("sambhav", 80)
        );

        List<Student> sortedByMarks = students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks))
                .toList();

        sortedByMarks.forEach(System.out::println);
    }
}

class Student {
    private final String name;
    private final int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "name: " + name + ", marks: " + marks;
    }
}