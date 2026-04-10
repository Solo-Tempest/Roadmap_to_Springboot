package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q15_AnyMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        int divBy = 5;
        boolean isContains = list.stream().anyMatch(num -> num % divBy == 0 );
        System.out.println(isContains);
    }
}
