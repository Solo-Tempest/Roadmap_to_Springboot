package Phase_1.week_2.part_1.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 5, 5, 5));
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > largest) {
                slargest = largest;
                largest = list.get(i);
            }
            else if (list.get(i) > slargest && list.get(i) < largest) {
                    slargest = list.get(i);
            }
        }
        if (!(slargest == Integer.MIN_VALUE)) {
            System.out.println(slargest);
        } else System.out.println("no second largest is present.");

    }
}
