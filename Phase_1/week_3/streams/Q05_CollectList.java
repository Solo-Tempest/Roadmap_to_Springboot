package Phase_1.week_3.streams;
import java.util.*;
import java.util.stream.Collectors;


public class Q05_CollectList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        int num1 = 2;
        List<Integer> multiplyBy3 = list.stream()
                .map(num -> num*num1)
                .collect(Collectors.toList());
        System.out.println(multiplyBy3);
    }
}
