package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q14_FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        Optional<Integer> firstGreaterThanThree = list.stream()
                .filter(num -> num > 3)
                .findFirst();
        firstGreaterThanThree.ifPresent(System.out::println);
    }
}
