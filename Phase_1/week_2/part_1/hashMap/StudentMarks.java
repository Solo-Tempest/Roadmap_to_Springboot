package Phase_1.week_2.part_1.hashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Aman", 85);
        students.put("Riya", 92);
        students.put("Rahul", 78);
        students.put("Sneha", 88);
        students.put("Dev", 95);

        System.out.println(getGrade(students, "Aman"));
        System.out.println(getTopScore(students));

    }

    static String getGrade(Map<String, Integer> map, String name) {
        if (!map.containsKey(name)) return name + "Not found";
        int marks = map.get(name);
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80 && marks < 90) {
            return "B";
        } else if (marks >= 70 && marks < 80) {
            return "C";
        } else {
            return "D";
        }
    }

    static String getTopScore(Map<String, Integer> map) {
        if (map.isEmpty()) return "no student marks are available";
        int maxMarks = -1;
        String maxStudent = null;
        for (String name : map.keySet()) {
            if (map.get(name) > maxMarks) {
                maxMarks = map.get(name);
                maxStudent = name;
            }
        }
        return maxStudent;
    }
}
