package Phase_1.week_3.predicate;

import java.util.function.Predicate;

public class BasicPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0;
        System.out.println(isEven.test(-2));
    }
}
