package Phase_1.week_2.part_1.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 3, 1, 4, 2));
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("original :" + list);
        System.out.println("After removing duplicates: " + set);

    }
}
