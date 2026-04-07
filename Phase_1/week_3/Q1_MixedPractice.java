package Phase_1.week_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Q1_MixedPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20);

        Predicate<Integer> greaterThan10 = a -> a > 10;
        Function<Integer, Integer> mulBy2 = a -> a * 2;
        Consumer<Integer> print = a -> System.out.println(a);

        for (int i : numbers) {
            if (greaterThan10.test(i)) {
                print.accept(mulBy2.apply(i));
            }
        }
    }
}
