package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q18_ReduceSum {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,2,3,4,5);
        int totalSum = number.stream()
                .reduce(0 , (a ,b ) -> a + b);
        System.out.println(totalSum);
    }
}
