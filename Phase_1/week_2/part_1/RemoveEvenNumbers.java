package Phase_1.week_2.part_1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Before removing:");
        System.out.println(list);
        System.out.println("after removal: ");
        list.removeIf(j -> j % 2 == 0);
        System.out.print(list);


    }
}
