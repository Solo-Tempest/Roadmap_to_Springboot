package Phase_1.week_3.function;

import java.util.function.Function;

public class BasicFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> doSquare = a -> a*a;
        System.out.println(doSquare.apply(3));
    }
}
