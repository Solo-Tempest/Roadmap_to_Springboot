package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q02_FilterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));
    }
}
