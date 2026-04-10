package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q11_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        List<Integer> uniqueElement = list.stream()
                .distinct()
                .toList();
        System.out.println(uniqueElement);
    }
}
