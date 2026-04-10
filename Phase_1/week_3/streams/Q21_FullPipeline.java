package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q21_FullPipeline {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,15,20,25);
        List<Integer> operationsPerformed = list.stream()
                .filter(num -> num > 10)
                .map(num -> num * 2)
                .sorted(Comparator.naturalOrder())
                .toList();
        operationsPerformed.forEach(System.out::println);
    }
}
