package Phase_1.week_2.part_1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        List<Integer> sorted = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                sorted.add(list1.get(i));
                i++;
            } else {
                sorted.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            sorted.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            sorted.add(list2.get(j));
            j++;
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(sorted);

    }
}
