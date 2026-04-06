package Phase_1.week_3.function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> toDouble = a -> a*2;
        Function<Integer, Integer> plus3 = a -> a+3;
        Function<Integer, Integer> both = toDouble.andThen(plus3);
        System.out.println(both.apply(5));
//        System.out.println( toDouble.andThen(plus3).apply(5));
    }
}
