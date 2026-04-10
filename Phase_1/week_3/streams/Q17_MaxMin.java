package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Q17_MaxMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,-5);
        Optional<Integer> maxNumber = list.stream().max(Integer::compare);
        Optional<Integer> minNumber = list.stream().min(Integer::compare);
        maxNumber.ifPresent(System.out::println);
        minNumber.ifPresent(System.out::println);

    }
}
