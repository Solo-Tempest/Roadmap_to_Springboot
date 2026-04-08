package Phase_1.week_3;

import java.lang.constant.Constable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q2_SystemFlow {
    public static void main(String[] args) {
        Supplier<Integer> rand = () -> (int) (Math.random() * 10);
        Predicate<Integer> isEven = a -> a % 2 == 0;
        Function<Integer, Integer> makeSquare = a -> a * a;
        Consumer<Integer> print = a -> System.out.println(a);

        for (int i = 0 ; i < 5 ; i++){
            int random = rand.get();
            if (isEven.test(random)){
                int squared = makeSquare.apply(random);
                print.accept(squared);
            }
        }
    }
}
