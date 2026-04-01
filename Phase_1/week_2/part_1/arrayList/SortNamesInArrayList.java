package Phase_1.week_2.part_1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortNamesInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList( "Aman","Dev", "Kunal", "Priya", "Rahul", "Riya", "Sneha", "Zoya"));
        System.out.println("original list: ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("sorted list: ");
        System.out.println(list);

        list.sort((a,b) -> a.length()-b.length());
        System.out.println("sorted based on string length: ");
        System.out.println(list);

//        Collections.sort(list , Collections.reverseOrder());   //all 3 methods are use to sort string list in reverse order
//        list.sort((a,b) -> b.compareTo(a));
        list.sort(Comparator.reverseOrder());
        System.out.println("sorted in reverse: ");
        System.out.println(list);
    }
}
