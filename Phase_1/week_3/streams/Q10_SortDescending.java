package Phase_1.week_3.streams;
import java.util.*;
import java.util.stream.Collectors;

public class Q10_SortDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        List<Integer> sorted = list.stream()
                .sorted((a,b) -> Integer.compare(b,a))
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
