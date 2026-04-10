package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q16_AllMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,4,-5);
        boolean isAllPositive = list.stream().allMatch(num -> num > 0);
        System.out.println(isAllPositive);
    }
}
