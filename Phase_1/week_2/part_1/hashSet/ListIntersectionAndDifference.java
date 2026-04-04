package Phase_1.week_2.part_1.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ListIntersectionAndDifference {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        List<Integer> intersection = new ArrayList<>(set1);
        System.out.println("Intersection: "+intersection);


        HashSet<Integer> set3 = new HashSet<>(list1);
        HashSet<Integer> set4 = new HashSet<>(list2);
        set3.removeAll(set4);
        List<Integer> difference = new ArrayList<>(set3);
        System.out.println("difference: "+difference);

     }
}
