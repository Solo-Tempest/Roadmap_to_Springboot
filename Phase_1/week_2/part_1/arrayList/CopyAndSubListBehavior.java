package Phase_1.week_2.part_1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyAndSubListBehavior {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> copy = new ArrayList<>(list);
        List<Integer> cSublist =  copy.subList(2,5);
        System.out.println(list);
        System.out.println(copy);
        System.out.println(cSublist);
        cSublist.remove(0);
        cSublist.add(66);
        System.out.println(cSublist);
        System.out.println(copy);

    }
}
