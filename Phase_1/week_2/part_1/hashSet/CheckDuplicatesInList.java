package Phase_1.week_2.part_1.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CheckDuplicatesInList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list2 + ": " + duplicates( list2));
        System.out.println(list1 + ": " + duplicates(list1));
    }

    static boolean duplicates(ArrayList<Integer> list){
        HashSet<Integer> set = new HashSet<>();
        for (int i : list){
            if (!set.add(i)) return true;
        }
        return false;
    }
}
