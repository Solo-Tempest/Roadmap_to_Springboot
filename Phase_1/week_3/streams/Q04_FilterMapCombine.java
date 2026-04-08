package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q04_FilterMapCombine {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .filter( num -> num > 3)
                .map(num -> num*3)
                .forEach(num -> System.out.println(num));
    }
}
