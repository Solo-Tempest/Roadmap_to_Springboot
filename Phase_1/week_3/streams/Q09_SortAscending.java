package Phase_1.week_3.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q09_SortAscending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 4, 6);
      List<Integer> sortedNumbers = numbers.stream()
              .sorted()
              .collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }
}
