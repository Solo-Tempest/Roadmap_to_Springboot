package Phase_1.week_1.part_1.Problem_3;
import java.util.*;
class Student{
    String name;
    int rollNo;
    int[] marks;

    Student(String name , int rollNo , int[] marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    double average(){
        double sum = 0;
        for (int i = 0; i < marks.length ; i++) {
            sum += marks[i];
        }
        return sum/(double) marks.length;
    }

    int highest(){
        int high = marks[0];
        for (int i = 0; i < marks.length ; i++) {
            if(marks[i] > high) high = marks[i];
        }
        return high;
    }

    int lowest(){
        int low = marks[0];
        for (int i = 0; i < marks.length ; i++) {
            if(marks[i] < low) low = marks[i];
        }
        return low;
    }


    @Override
    public String toString(){
        return "Name : "+ name + "\n" + "RollNo. : " + rollNo + "\n" + "Marks : " +Arrays.toString(marks) + "\n" + "Average : " + average() + "\n" + "Highest : " + highest() + "\n" + "Lowest : " + lowest() ;
    }
}

public class Problem_3 {
    public static void main(String[] args) {
        int[] marks = {100 , 20 , 50};
        Student s1 = new Student("Aditya Gupta" , 2 , marks);
        Student s2 = new Student("saksham" , 20 , new int[]{80 ,90 ,75});

        System.out.println(s1.average() + "  " + s1.highest() + " "  + s1.lowest());
        System.out.println(s1.toString());
    }
}
