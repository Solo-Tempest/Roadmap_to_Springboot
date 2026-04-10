package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q23_SecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,10,15,20,25);
        int secondLargest = numbers.stream()
                .sorted((a,b) -> Integer.compare(b,a))
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(secondLargest);

    }
}
