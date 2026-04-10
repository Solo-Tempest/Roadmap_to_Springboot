package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q13_CountElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);
        long count = list.stream().filter(num -> num > 3).count();
        System.out.println(count);
    }
}
