package Phase_1.week_2.part_1;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Aditya");
        students.add("Shreya");
        students.add("Rupali");
        students.add("Saksham");
        students.add("Brij");
        students.add("Sunita");

        System.out.println(" using enchanced for loop");
        for (String i : students){
            System.out.println(i);
        }

        System.out.println("-----------");

        System.out.println("using for loop");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
