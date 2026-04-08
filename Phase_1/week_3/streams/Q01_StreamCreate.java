package Phase_1.week_3.streams;

import java.util.Arrays;
import java.util.List;

public class Q01_StreamCreate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(x -> System.out.println(x));
    }
}
