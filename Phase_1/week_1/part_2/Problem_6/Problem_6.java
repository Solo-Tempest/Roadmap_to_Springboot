package Phase_1.week_1.part_2.Problem_6;

public class Problem_6 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Rahul", 40),
                new Student("Amit", 20, 1, new int[]{80, 70, 90}),
                new GraduateStudent("Aditya", 23, 2, new int[]{50, 60, 45}, "Blood Bridge")
        };

        for (Person p : people) {

            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);

            // Check GraduateStudent first (most specific)
            if (p instanceof GraduateStudent) {
                GraduateStudent g = (GraduateStudent) p;
                System.out.println("Roll No: " + g.rollNo);
                System.out.println("Marks: " + arrayToString(g.marks));
                System.out.println("Thesis Title: " + g.thesisTitle);

            }
            // Then check Student
            else if (p instanceof Student) {
                Student s = (Student) p;
                System.out.println("Roll No: " + s.rollNo);
                System.out.println("Marks: " + arrayToString(s.marks));
            }

            System.out.println("----------------------");
        }
    }

    // Helper method to print array nicely
    static String arrayToString(int[] arr) {
        if (arr == null || arr.length == 0) return "[]";

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) result += ", ";
        }
        result += "]";
        return result;
    }
}

    class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    class Student extends Person {
        int rollNo;
        int[] marks;

        public Student(String name, int age, int rollNo, int[] marks) {
            super(name, age);
            this.rollNo = rollNo;
            this.marks = marks;
        }
    }

    class GraduateStudent extends Student {
        String thesisTitle;

        public GraduateStudent(String name, int age, int rollNo, int[] marks, String thesisTitle) {
            super(name, age, rollNo, marks);
            this.thesisTitle = thesisTitle;
        }
    }
