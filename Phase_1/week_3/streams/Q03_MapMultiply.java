package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q03_MapMultiply {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
        numbers.stream()
                .map(num -> num * 2)
                .forEach(System.out::println);
    }
}
