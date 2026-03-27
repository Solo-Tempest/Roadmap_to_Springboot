package Phase_1.week_1.part_2.Problem_3;

public class Problem_3 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer(80000, 50, 1000),
                new Manager(60000, 5000)
        };

        for (Employee e : employees) {
            System.out.println("Employee : " + e.getClass().getSimpleName());
            System.out.println("Salary : " + e.calculateSalary());
            System.out.println("--------------------------");
        }

    }
}

abstract class Employee {
    abstract double calculateSalary();
}

class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(double salary, double bonus) {
        this.baseSalary = salary;
        this.bonus = bonus;

    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    double BaseSalary;
    double extraWork;
    double rate;

    Developer(double salary, double extraWork, double rate) {
        this.BaseSalary = salary;
        this.extraWork = extraWork;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return BaseSalary + (extraWork * rate);
    }
}
