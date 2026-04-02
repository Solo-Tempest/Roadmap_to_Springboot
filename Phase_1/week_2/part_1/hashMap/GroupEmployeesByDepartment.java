package Phase_1.week_2.part_1.hashMap;

import java.lang.reflect.Array;
import java.util.*;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        Employee Aman = new Employee("Aman", "IT", 70000);
        Employee Riya = new Employee("Riya", "HR", 50000);
        Employee Rahul = new Employee("Rahul", "IT", 90000);
        Employee Sneha = new Employee("Sneha", "HR", 80000);
        Employee Dev = new Employee("Dev", "Sales", 60000);

        List<Employee> list = new ArrayList<>();
        list.add(Aman);
        list.add(Rahul);
        list.add(Riya);
        list.add(Sneha);
        list.add(Dev);

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            if (map.containsKey(e.department)) {
                map.get(e.department).add(e);
            } else {
                List<Employee> newList = new ArrayList<>();
                newList.add(e);
                map.put(e.department, newList);
            }
        }

        for (Map.Entry<String, List<Employee>> m : map.entrySet()) {
            int total = 0;
            ArrayList<String> names = new ArrayList<>();
            for (Employee e : m.getValue()) {

                names.add(e.name);
                total += e.salary;
            }
            int average = total / m.getValue().size();
            System.out.println("Department : " + m.getKey());
            System.out.println("Employees : " + names);
            System.out.println("Total Salary : " + total);
            System.out.println("Average Salary : " + average);
            System.out.println();
        }
    }
}

class Employee {
    String name;
    int salary;
    String department;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
