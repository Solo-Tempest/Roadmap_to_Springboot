package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q19_ReduceProduct {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,2,3,4);
        int multiplyByAll = number.stream()
                .reduce(1 , (a , b) -> a * b);
        System.out.println(multiplyByAll);
    }
}
