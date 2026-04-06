package Phase_1.week_3.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLoop {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0;
        Predicate<Integer> isgreater = a -> a > 3;
        Predicate<Integer> both = isEven.and(isgreater);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (int i : list){
            if (isEven.test(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i : list){
            if (both.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
