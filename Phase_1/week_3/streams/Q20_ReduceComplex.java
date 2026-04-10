package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q20_ReduceComplex {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        int sumOfSquare = numbers.stream()
                .map(a -> a * a)
                .reduce(0 , (sum , num) -> sum + num);
        System.out.println(sumOfSquare);

        int sumOfSquares = numbers.stream()
                .reduce(0 , (sum , num) -> sum + (num * num));
        System.out.println(sumOfSquares);
    }
}
