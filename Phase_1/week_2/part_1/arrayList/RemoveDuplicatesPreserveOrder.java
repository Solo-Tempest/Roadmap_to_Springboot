package Phase_1.week_2.part_1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesPreserveOrder {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1, 4, 2, 5};
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
